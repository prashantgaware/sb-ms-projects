package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SP_DATA_MOVIE")
public class Movie implements Serializable {
	
	@Id
	@Column(name = "MovieID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	
	@Column(name = "MovieName", length = 20)
	private String movieName;
	
	@Column(name = "Year", length = 20)
	private String releaseyYear;
	
	@Column(name = "Rating")
	private Float rating;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleaseyYear() {
		return releaseyYear;
	}

	public void setReleaseyYear(String releaseyYear) {
		this.releaseyYear = releaseyYear;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	
}
