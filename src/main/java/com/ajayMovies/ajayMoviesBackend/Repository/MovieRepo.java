package com.ajayMovies.ajayMoviesBackend.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajayMovies.ajayMoviesBackend.Entity.Movie;

import java.util.List;

import com.ajayMovies.ajayMoviesBackend.Enums.Categories;




@Repository
public interface  MovieRepo extends JpaRepository<Movie, Long> {
    Page<Movie> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    Page<Movie> findByCategory(Categories category, Pageable pageable);
    Page<Movie> findByTitleContainingIgnoreCaseAndCategory(String title, Categories category, Pageable pageable);
}
