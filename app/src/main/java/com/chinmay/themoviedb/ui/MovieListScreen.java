package com.chinmay.themoviedb.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.chinmay.themoviedb.R;
import com.chinmay.themoviedb.communication.WebCommunicator;
import com.chinmay.themoviedb.databinding.ActivityMovieListScreenBinding;
import com.chinmay.themoviedb.pojo.ListMovieDetailsResponse;
import com.chinmay.themoviedb.pojo.MovieDetailMessageEvent;
import com.chinmay.themoviedb.pojo.MovieDetailResponse;
import com.chinmay.themoviedb.pojo.UpcomingMovieMessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class MovieListScreen extends AppCompatActivity implements MoviesAdapter.IClick{
	private ActivityMovieListScreenBinding activityMovieListScreenBinding;
	private MoviesAdapter moviesAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		activityMovieListScreenBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie_list_screen);
	}

	@Override
	protected void onStart() {
		super.onStart();
		EventBus.getDefault().register(this);
		WebCommunicator.getTopMoviesList();
	}

	@Override
	public void onStop() {
		super.onStop();
		EventBus.getDefault().unregister(this);
	}

	// This method will be called when a MessageEvent is posted (in the UI thread for Toast)
	@Subscribe(threadMode = ThreadMode.BACKGROUND)
	public void onMessageEvent(UpcomingMovieMessageEvent event) {
		if (event.isSuccess()) {
			runOnUiThread(
					new UIRunnable(
							new ArrayList<>(event.response.results)));
		} else {

		}
	}

	// This method will be called when a MessageEvent is posted (in the UI thread for Toast)
	@Subscribe(threadMode = ThreadMode.BACKGROUND)
	public void onMessageEvent(MovieDetailMessageEvent event) {
		if (event.isSuccess()) {

		} else {

		}
	}

	@Override
	public void clickedForUrl(long movieId) {
		//WebCommunicator.getMovieDetails(movieId);
		startMovieDetailsScreen(movieId);
	}

	private class UIRunnable implements Runnable{
		private ArrayList<ListMovieDetailsResponse> stories;
		public UIRunnable(ArrayList<ListMovieDetailsResponse> stories){
			this.stories = stories;
		}

		@Override
		public void run() {
			setMoviesAdapter(stories);
		}
	}

	private class UIRunnableMovieDetail implements Runnable{
		private long movieId;
		public UIRunnableMovieDetail(long movieId){
			this.movieId = movieId;
		}

		@Override
		public void run() {
			startMovieDetailsScreen(movieId);
		}
	}

	private void startMovieDetailsScreen(long movieId){
		Intent intent = new Intent(this, MovieDetailScreen.class);
		intent.putExtra(MovieDetailScreen.KEY_MOVIE_ID, movieId);
		startActivity(intent);
	}

	private void setMoviesAdapter(ArrayList<ListMovieDetailsResponse> stories ){
		moviesAdapter = new MoviesAdapter(this, stories, this);
		activityMovieListScreenBinding.rvNewsList.setVisibility(View.VISIBLE);
		LinearLayoutManager layoutManager
				= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
		activityMovieListScreenBinding.rvNewsList.setLayoutManager(layoutManager);
		activityMovieListScreenBinding.rvNewsList.setAdapter(moviesAdapter);
	}
}
