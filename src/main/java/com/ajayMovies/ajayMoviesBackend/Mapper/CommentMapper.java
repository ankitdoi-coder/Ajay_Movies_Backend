package com.ajayMovies.ajayMoviesBackend.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ajayMovies.ajayMoviesBackend.DTO.CommentDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Comment;
import com.ajayMovies.ajayMoviesBackend.Repository.MovieRepo;

@Component
public class CommentMapper {
    @Autowired
    MovieRepo movieRepo;

    // Dto To Comment Enity
    public Comment dtoToComment(CommentDTO commentDTO) {
        if (commentDTO == null) {
            return null;
        }

        Comment comment = new Comment();

        comment.setId(commentDTO.getId());
        comment.setName(commentDTO.getName());
        comment.setComment(commentDTO.getComment());
        comment.setCreatedAt(commentDTO.getCreatedAt());
        Long movieId = commentDTO.getMovieId();
        if (movieId != null) {
            comment.setMovie(movieRepo.findById(movieId).orElse(null));
        }

        return comment;

    }
}
