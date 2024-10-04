package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieManagementService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IMovieManagementService movieMgmt;
	
	@Override
	public void run(String ...args) throws Exception {
		Movie movie1 = new Movie();
		movie1.setMovieName("RRR");
		movie1.setRating(4.6f);
		movie1.setReleaseyYear("2022");
		
		Movie movie2 = new Movie();
		movie1.setMovieName("Kings");
		movie1.setRating(4.3f);
		movie1.setReleaseyYear("2023");
		try {
			System.out.println(movieMgmt.registerMovie(movie1));
			System.out.println(movieMgmt.registerMovie(movie2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
