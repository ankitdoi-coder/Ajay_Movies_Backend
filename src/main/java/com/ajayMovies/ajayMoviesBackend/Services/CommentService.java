package com.ajayMovies.ajayMoviesBackend.Services;

import com.ajayMovies.ajayMoviesBackend.DTO.CommentDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Comment;
import java.util.List;

public interface CommentService {
    Comment addComment(CommentDTO commentDTO);
    List<Comment> getCommentByMovieId(Long movieId);
}
