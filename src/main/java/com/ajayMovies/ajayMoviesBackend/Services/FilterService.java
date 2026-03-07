package com.ajayMovies.ajayMoviesBackend.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;

public interface  FilterService {
    Page<Movie> searchWithFilters(String title, String category, Pageable pageable);
}
