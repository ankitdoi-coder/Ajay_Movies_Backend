package com.ajayMovies.ajayMoviesBackend.Services.Impl;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ajayMovies.ajayMoviesBackend.DTO.MovieDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Movie;
import com.ajayMovies.ajayMoviesBackend.Mapper.MovieMapper;
import com.ajayMovies.ajayMoviesBackend.Repository.MovieRepo;
import com.ajayMovies.ajayMoviesBackend.Services.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;
    @Autowired
    MovieMapper movieMapper;

    @Override
    public Movie saveMovie(MovieDTO movieDTO, MultipartFile poster, List<MultipartFile> screenshots) throws IOException {
        Movie savedMovie = movieRepo.save(movieMapper.DtoToMovie(movieDTO, poster, screenshots));
        return savedMovie;
    }

    @Override
    public List<Movie> getAllMovies() throws IOException {
        // The Movie entities should already have the correct public URL path for images.
        // No path manipulation should be needed here. This fixes a bug where the
        // subfolder (e.g., 'posters') was being stripped from the URL.
        return movieRepo.findAll();
    }

    @Override
    public Movie getMovieByID(Long id) throws IOException {
        Movie movie = movieRepo.findById(id).orElse(null);
        return movie;
    }

}
