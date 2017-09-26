package com.chinmay.themoviedb.pojo;

/**
 * Created by chinmaydeshpande on 26/09/17.
 */

public class ListMovieDetailsResponse {
	/*{
		"vote_count": 1108,
			"id": 346364,
			"video": false,
			"vote_average": 7.5,
			"title": "It",
			"popularity": 800.186588,
			"poster_path": "/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg",
			"original_language": "en",
			"original_title": "It",
			"genre_ids": [
		12,
				18,
				27
			],
		"backdrop_path": "/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg",
			"adult": false,
			"overview": "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
			"release_date": "2017-09-05"
	}*/
	public long vote_count;
	public long id;
	public boolean video;//": false,
	public double vote_average;//": 7.5,
	public String title;//": "It",
	public double popularity;//": 800.186588,
	public String poster_path;//": "/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg",
	public String original_language;//": "en",
	public String original_title;//": "It",
	public int[] genre_ids;//": [ 12, 18, 27 ],
	public String backdrop_path;//": "/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg",
	public boolean adult;//": false,
	public String overview;//": "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
	public String release_date;//": "2017-09-05"
}
