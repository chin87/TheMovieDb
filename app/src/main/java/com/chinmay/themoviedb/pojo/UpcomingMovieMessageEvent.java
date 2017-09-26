package com.chinmay.themoviedb.pojo;

/**
 * Created by chinmaydeshpande on 26/09/17.
 */

public class UpcomingMovieMessageEvent extends MessageEvent {
	public final UpcomingMoviesResponse response;

	public UpcomingMovieMessageEvent(int status,
									 UpcomingMoviesResponse response) {
		this.status = status;
		this.response = response;
	}

	public boolean isSuccess(){
		return status == 0;
	}

}
