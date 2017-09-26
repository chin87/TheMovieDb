package com.chinmay.themoviedb.pojo;

/**
 * Created by chinmaydeshpande on 26/09/17.
 */

public class MovieDetailMessageEvent extends MessageEvent {
	public final MovieDetailResponse response;

	public MovieDetailMessageEvent(int status,
									 MovieDetailResponse response) {
		this.status = status;
		this.response = response;
	}

	public boolean isSuccess(){
		return status == 0;
	}
}
