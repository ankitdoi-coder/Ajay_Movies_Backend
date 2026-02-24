package com.ajayMovies.ajayMoviesBackend.Services.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;
import com.ajayMovies.ajayMoviesBackend.Enums.Categories;
import com.ajayMovies.ajayMoviesBackend.Repository.MovieRepo;
import com.ajayMovies.ajayMoviesBackend.Services.FilterService;

@Service
public class FilterServiceImpl implements FilterService {

    @Autowired
    MovieRepo movieRepo;

    // category search
    public List<Movie> findByCategory(String category) {
        Categories categ = Categories.valueOf(category);
        return movieRepo.findByCategory(categ);
    }

    // search by title
    public List<Movie> findByTitle(String title) {
        return movieRepo.findByTitleContainingIgnoreCase(title);
    }

    // search By Both title and Category
    @Override
    public List<Movie> searchWithFilters(String title, String category) {
        if (title != null && category != null) {
            return movieRepo.findByTitleContainingIgnoreCaseAndCategory(title, Categories.valueOf(category));
        } else if (category != null) {
            return movieRepo.findByCategory(Categories.valueOf(category));
        } else {
            return movieRepo.findByTitleContainingIgnoreCase(title);
        }
    }

}
