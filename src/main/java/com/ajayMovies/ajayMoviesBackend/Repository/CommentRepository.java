package com.ajayMovies.ajayMoviesBackend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajayMovies.ajayMoviesBackend.Entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> getByMovieId(Long movieId);
}
