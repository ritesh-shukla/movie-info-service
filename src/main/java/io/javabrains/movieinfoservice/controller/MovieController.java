package io.javabrains.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.movieinfoservice.model.Movie;
@RestController
@RequestMapping("/movie")
public class MovieController {
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")int movieId)
	{
		return new Movie(movieId,"Transformers");
	}

	

}
