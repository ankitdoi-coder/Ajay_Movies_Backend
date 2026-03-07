package com.ajayMovies.ajayMoviesBackend.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;
import com.ajayMovies.ajayMoviesBackend.Enums.Categories;
import com.ajayMovies.ajayMoviesBackend.Repository.MovieRepo;
import com.ajayMovies.ajayMoviesBackend.Services.FilterService;

@Service
public class FilterServiceImpl implements FilterService {

    @Autowired
    MovieRepo movieRepo;

    @Override
    public Page<Movie> searchWithFilters(String title, String category, Pageable pageable) {
        if (title != null && category != null) {
            return movieRepo.findByTitleContainingIgnoreCaseAndCategory(title, Categories.valueOf(category), pageable);
        } else if (category != null) {
            return movieRepo.findByCategory(Categories.valueOf(category), pageable);
        } else if (title != null) {
            return movieRepo.findByTitleContainingIgnoreCase(title, pageable);
        } else {
            return movieRepo.findAll(pageable);
        }
    }
}
