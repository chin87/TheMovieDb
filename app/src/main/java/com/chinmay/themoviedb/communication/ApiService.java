package com.chinmay.themoviedb.communication;

import com.chinmay.themoviedb.pojo.MovieDetailResponse;
import com.chinmay.themoviedb.pojo.UpcomingMoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hp on 9/9/17.
 */


public interface ApiService {

	@GET("upcoming?api_key=b7cd3340a794e5a2f35e3abb820b497f")
	Call<UpcomingMoviesResponse> getTopMoviesList();

	@GET("{movieid}?api_key=b7cd3340a794e5a2f35e3abb820b497f")
	Call<MovieDetailResponse> getMovieDetails(@Path("movieid") long movieid);
/*
	@GET("item/{storyid}.json")
    Call<StoryResponse> getStoryDetails(@Path("storyid") String storyid);*/

/*    @GET("autocomplete/json")
    Call<AutoCompleteGooglePlaces> getAutoCompleteResults(@Query("key") String API_KEY,
                                                          @Query("input") String encode);

    @GET("nearbysearch/json")
    Call<GetPlacesResponse> getPlaceDetails(@Query("location") String location,
                                            @Query("radius") int radius,
                                            @Query("key") String key);*/
}