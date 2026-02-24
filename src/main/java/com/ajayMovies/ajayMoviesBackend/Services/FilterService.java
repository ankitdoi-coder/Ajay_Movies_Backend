package com.ajayMovies.ajayMoviesBackend.Services;

import java.util.List;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;

public interface  FilterService {
    List<Movie> searchWithFilters(String title, String category);
    
}
