package com.ajayMovies.ajayMoviesBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;

import java.util.List;

import com.ajayMovies.ajayMoviesBackend.Enums.Categories;




@Repository
public interface  MovieRepo extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findByCategory(Categories category);
    List<Movie> findByTitleContainingIgnoreCaseAndCategory(String title, Categories category);
}
