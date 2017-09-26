package com.chinmay.themoviedb.pojo;

/**
 * Created by chinmaydeshpande on 26/09/17.
 */

public class MovieDetailResponse
/*	{
		"adult": false,
			"backdrop_path": "/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg",
			"belongs_to_collection": {
		"id": 474350,
				"name": "IT: Movie Collection",
				"poster_path": "/3GFxHDrhHQOVAzgULZc70HbDquo.jpg",
				"backdrop_path": "/aOMCLLvU4BuoZt2vy5tskyFetkz.jpg"
	},
		"budget": 35000000,
			"genres": [
		{
			"id": 12,
				"name": "Adventure"
		},
		{
			"id": 18,
				"name": "Drama"
		},
		{
			"id": 27,
				"name": "Horror"
		}
    ],
		"homepage": "http://itthemovie.com/",
			"id": 346364,
			"imdb_id": "tt1396484",
			"original_language": "en",
			"original_title": "It",
			"overview": "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
			"popularity": 799.186588,
			"poster_path": "/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg",
			"production_companies": [
		{
			"name": "New Line Cinema",
				"id": 12
		},
		{
			"name": "Vertigo Entertainment",
				"id": 829
		},
		{
			"name": "Lin Pictures",
				"id": 2723
		},
		{
			"name": "RatPac-Dune Entertainment",
				"id": 41624
		},
		{
			"name": "KatzSmith Productions",
				"id": 87671
		}
    ],
		"production_countries": [
		{
			"iso_3166_1": "US",
				"name": "United States of America"
		}
    ],
		"release_date": "2017-09-05",
			"revenue": 477803881,
			"runtime": 135,
			"spoken_languages": [
		{
			"iso_639_1": "en",
				"name": "English"
		}
    ],
		"status": "Released",
			"tagline": "Your fears are unleashed",
			"title": "It",
			"video": false,
			"vote_average": 7.5,
			"vote_count": 1129
	}*/
{
	private String budget;

	private String vote_average;

	private String backdrop_path;

	private Genres[] genres;

	private String status;

	private String runtime;

	private Spoken_languages[] spoken_languages;

	private String adult;

	private String homepage;

	private String id;

	private Production_countries[] production_countries;

	private String title;

	private String original_language;

	private String overview;

	private Production_companies[] production_companies;

	private Belongs_to_collection belongs_to_collection;

	private String imdb_id;

	private String release_date;

	private String original_title;

	private String vote_count;

	private String poster_path;

	private String video;

	private String tagline;

	private String revenue;

	private String popularity;

	public String getBudget ()
	{
		return budget;
	}

	public void setBudget (String budget)
	{
		this.budget = budget;
	}

	public String getVote_average ()
	{
		return vote_average;
	}

	public void setVote_average (String vote_average)
	{
		this.vote_average = vote_average;
	}

	public String getBackdrop_path ()
	{
		return backdrop_path;
	}

	public void setBackdrop_path (String backdrop_path)
	{
		this.backdrop_path = backdrop_path;
	}

	public Genres[] getGenres ()
	{
		return genres;
	}

	public void setGenres (Genres[] genres)
	{
		this.genres = genres;
	}

	public String getStatus ()
	{
		return status;
	}

	public void setStatus (String status)
	{
		this.status = status;
	}

	public String getRuntime ()
	{
		return runtime;
	}

	public void setRuntime (String runtime)
	{
		this.runtime = runtime;
	}

	public Spoken_languages[] getSpoken_languages ()
	{
		return spoken_languages;
	}

	public void setSpoken_languages (Spoken_languages[] spoken_languages)
	{
		this.spoken_languages = spoken_languages;
	}

	public String getAdult ()
	{
		return adult;
	}

	public void setAdult (String adult)
	{
		this.adult = adult;
	}

	public String getHomepage ()
	{
		return homepage;
	}

	public void setHomepage (String homepage)
	{
		this.homepage = homepage;
	}

	public String getId ()
	{
		return id;
	}

	public void setId (String id)
	{
		this.id = id;
	}

	public Production_countries[] getProduction_countries ()
	{
		return production_countries;
	}

	public void setProduction_countries (Production_countries[] production_countries)
	{
		this.production_countries = production_countries;
	}

	public String getTitle ()
	{
		return title;
	}

	public void setTitle (String title)
	{
		this.title = title;
	}

	public String getOriginal_language ()
	{
		return original_language;
	}

	public void setOriginal_language (String original_language)
	{
		this.original_language = original_language;
	}

	public String getOverview ()
	{
		return overview;
	}

	public void setOverview (String overview)
	{
		this.overview = overview;
	}

	public Production_companies[] getProduction_companies ()
	{
		return production_companies;
	}

	public void setProduction_companies (Production_companies[] production_companies)
	{
		this.production_companies = production_companies;
	}

	public Belongs_to_collection getBelongs_to_collection ()
	{
		return belongs_to_collection;
	}

	public void setBelongs_to_collection (Belongs_to_collection belongs_to_collection)
	{
		this.belongs_to_collection = belongs_to_collection;
	}

	public String getImdb_id ()
	{
		return imdb_id;
	}

	public void setImdb_id (String imdb_id)
	{
		this.imdb_id = imdb_id;
	}

	public String getRelease_date ()
	{
		return release_date;
	}

	public void setRelease_date (String release_date)
	{
		this.release_date = release_date;
	}

	public String getOriginal_title ()
	{
		return original_title;
	}

	public void setOriginal_title (String original_title)
	{
		this.original_title = original_title;
	}

	public String getVote_count ()
	{
		return vote_count;
	}

	public void setVote_count (String vote_count)
	{
		this.vote_count = vote_count;
	}

	public String getPoster_path ()
	{
		return poster_path;
	}

	public void setPoster_path (String poster_path)
	{
		this.poster_path = poster_path;
	}

	public String getVideo ()
	{
		return video;
	}

	public void setVideo (String video)
	{
		this.video = video;
	}

	public String getTagline ()
	{
		return tagline;
	}

	public void setTagline (String tagline)
	{
		this.tagline = tagline;
	}

	public String getRevenue ()
	{
		return revenue;
	}

	public void setRevenue (String revenue)
	{
		this.revenue = revenue;
	}

	public String getPopularity ()
	{
		return popularity;
	}

	public void setPopularity (String popularity)
	{
		this.popularity = popularity;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [budget = "+budget+", vote_average = "+vote_average+", backdrop_path = "+backdrop_path+", genres = "+genres+", status = "+status+", runtime = "+runtime+", spoken_languages = "+spoken_languages+", adult = "+adult+", homepage = "+homepage+", id = "+id+", production_countries = "+production_countries+", title = "+title+", original_language = "+original_language+", overview = "+overview+", production_companies = "+production_companies+", belongs_to_collection = "+belongs_to_collection+", imdb_id = "+imdb_id+", release_date = "+release_date+", original_title = "+original_title+", vote_count = "+vote_count+", poster_path = "+poster_path+", video = "+video+", tagline = "+tagline+", revenue = "+revenue+", popularity = "+popularity+"]";
	}

	public class Spoken_languages
	{
		private String iso_639_1;

		private String name;

		public String getIso_639_1 ()
		{
			return iso_639_1;
		}

		public void setIso_639_1 (String iso_639_1)
		{
			this.iso_639_1 = iso_639_1;
		}

		public String getName ()
		{
			return name;
		}

		public void setName (String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "ClassPojo [iso_639_1 = "+iso_639_1+", name = "+name+"]";
		}
	}

	public class Production_countries
	{
		private String name;

		private String iso_3166_1;

		public String getName ()
		{
			return name;
		}

		public void setName (String name)
		{
			this.name = name;
		}

		public String getIso_3166_1 ()
		{
			return iso_3166_1;
		}

		public void setIso_3166_1 (String iso_3166_1)
		{
			this.iso_3166_1 = iso_3166_1;
		}

		@Override
		public String toString()
		{
			return "ClassPojo [name = "+name+", iso_3166_1 = "+iso_3166_1+"]";
		}
	}

	public class Production_companies
	{
		private String id;

		private String name;

		public String getId ()
		{
			return id;
		}

		public void setId (String id)
		{
			this.id = id;
		}

		public String getName ()
		{
			return name;
		}

		public void setName (String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "ClassPojo [id = "+id+", name = "+name+"]";
		}
	}

	public class Genres
	{
		private String id;

		private String name;

		public String getId ()
		{
			return id;
		}

		public void setId (String id)
		{
			this.id = id;
		}

		public String getName ()
		{
			return name;
		}

		public void setName (String name)
		{
			this.name = name;
		}

		@Override
		public String toString()
		{
			return "ClassPojo [id = "+id+", name = "+name+"]";
		}
	}

	public class Belongs_to_collection
	{
		private String id;

		private String backdrop_path;

		private String name;

		private String poster_path;

		public String getId ()
		{
			return id;
		}

		public void setId (String id)
		{
			this.id = id;
		}

		public String getBackdrop_path ()
		{
			return backdrop_path;
		}

		public void setBackdrop_path (String backdrop_path)
		{
			this.backdrop_path = backdrop_path;
		}

		public String getName ()
		{
			return name;
		}

		public void setName (String name)
		{
			this.name = name;
		}

		public String getPoster_path ()
		{
			return poster_path;
		}

		public void setPoster_path (String poster_path)
		{
			this.poster_path = poster_path;
		}

		@Override
		public String toString()
		{
			return "ClassPojo [id = "+id+", backdrop_path = "+backdrop_path+", name = "+name+", poster_path = "+poster_path+"]";
		}
	}
}
