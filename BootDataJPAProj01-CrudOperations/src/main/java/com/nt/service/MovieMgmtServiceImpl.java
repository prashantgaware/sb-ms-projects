package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;

@Service
public class MovieMgmtServiceImpl implements IMovieManagementService {
	
	@Autowired
	private IMovieRepo movieRepo;

	@Override
	public String registerMovie(Movie movieName) {
		Movie movie1 = movieRepo.save(movieName);
		
		return "Movie is registered with Movie ID : " + movie1.getMovieId();
	}

}
