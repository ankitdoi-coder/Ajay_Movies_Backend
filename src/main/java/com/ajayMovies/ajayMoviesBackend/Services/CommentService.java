package com.ajayMovies.ajayMoviesBackend.Services;

import com.ajayMovies.ajayMoviesBackend.DTO.CommentDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Comment;

public interface CommentService {
    Comment addComment(CommentDTO commentDTO);
}
