package com.chinmay.themoviedb.communication;

import com.chinmay.themoviedb.pojo.MessageEvent;
import com.chinmay.themoviedb.pojo.MovieDetailMessageEvent;
import com.chinmay.themoviedb.pojo.MovieDetailResponse;
import com.chinmay.themoviedb.pojo.UpcomingMovieMessageEvent;
import com.chinmay.themoviedb.pojo.UpcomingMoviesResponse;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hp on 9/9/17.
 */

public class WebCommunicator {
    private static final String API_BASE = "https://api.themoviedb.org/3/movie/";
    private static Retrofit retrofit;

    public static void getTopMoviesList() {
        Retrofit retrofit = getRetrofitBuild();
        ApiService requestInterface = retrofit.create(ApiService.class);
        Call<UpcomingMoviesResponse> call = requestInterface.getTopMoviesList();
        call.enqueue(new Callback<UpcomingMoviesResponse>() {
            @Override
            public void onResponse(Call<UpcomingMoviesResponse> call, Response<UpcomingMoviesResponse> response) {
                EventBus.getDefault().post(new UpcomingMovieMessageEvent(MessageEvent.SUCCESS, response.body()));
            }

            @Override
            public void onFailure(Call<UpcomingMoviesResponse> call, Throwable t) {
                EventBus.getDefault().post(new UpcomingMovieMessageEvent(MessageEvent.FAIL, null));
            }
        });
    }

    public static void getMovieDetails(long movieid ) {
        Retrofit retrofit = getRetrofitBuild();
        ApiService requestInterface = retrofit.create(ApiService.class);
        Call<MovieDetailResponse> call = requestInterface.getMovieDetails(movieid);
        call.enqueue(new Callback<MovieDetailResponse>() {
            @Override
            public void onResponse(Call<MovieDetailResponse> call, Response<MovieDetailResponse> response) {
                EventBus.getDefault().post(new MovieDetailMessageEvent(MessageEvent.SUCCESS, response.body()));
            }

            @Override
            public void onFailure(Call<MovieDetailResponse> call, Throwable t) {
                EventBus.getDefault().post(new MovieDetailMessageEvent(MessageEvent.FAIL, null));
            }
        });
    }

    private static Retrofit getRetrofitBuild() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BASE)
                    .addConverterFactory(GsonConverterFactory.create(getGsonInstance()))
                    .callbackExecutor(Executors.newSingleThreadExecutor())
                    .build();
        }
        return retrofit;
    }

    private static Gson getGsonInstance() {
        return new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        }).create();
    }
}
