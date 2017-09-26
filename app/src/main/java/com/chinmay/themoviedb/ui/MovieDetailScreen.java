package com.chinmay.themoviedb.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.chinmay.themoviedb.BR;
import com.chinmay.themoviedb.R;
import com.chinmay.themoviedb.communication.WebCommunicator;
import com.chinmay.themoviedb.databinding.ActivityMovieDetailScreenBinding;
import com.chinmay.themoviedb.pojo.MovieDetailMessageEvent;
import com.chinmay.themoviedb.pojo.UpcomingMovieMessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

/**
 * Created by chinmaydeshpande on 26/09/17.
 */

public class MovieDetailScreen extends AppCompatActivity {
	private ActivityMovieDetailScreenBinding activityMovieDetailScreenBinding;
	private long movieId;
	public static final String KEY_MOVIE_ID = "KEY_MOVIE_ID";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		activityMovieDetailScreenBinding =
				DataBindingUtil.setContentView(this, R.layout.activity_movie_detail_screen);
		Intent intent = getIntent();
		movieId = intent.getLongExtra(KEY_MOVIE_ID, 0);
	}

	@Override
	protected void onStart() {
		super.onStart();
		EventBus.getDefault().register(this);
		WebCommunicator.getMovieDetails(movieId);
	}

	@Override
	public void onStop() {
		super.onStop();
		EventBus.getDefault().unregister(this);
	}

	// This method will be called when a MessageEvent is posted (in the UI thread for Toast)
	@Subscribe(threadMode = ThreadMode.BACKGROUND)
	public void onMessageEvent(MovieDetailMessageEvent event) {
		if (event.isSuccess()) {
			activityMovieDetailScreenBinding.setVariable(BR.movie, event.response);

		} else {

		}
	}

}
