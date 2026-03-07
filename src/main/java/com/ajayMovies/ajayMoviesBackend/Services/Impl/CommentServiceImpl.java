package com.ajayMovies.ajayMoviesBackend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajayMovies.ajayMoviesBackend.DTO.CommentDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Comment;
import com.ajayMovies.ajayMoviesBackend.Mapper.CommentMapper;
import com.ajayMovies.ajayMoviesBackend.Repository.CommentRepository;
import com.ajayMovies.ajayMoviesBackend.Services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;
    @Autowired
    CommentMapper commentMapper;


    @Override
    public Comment addComment(CommentDTO commentDTO) {
      Comment savedComment= commentRepository.save(commentMapper.dtoToComment(commentDTO));
      return savedComment;
    }


    @Override
    public List<Comment> getCommentByMovieId(Long movieId) {
      List<Comment> comments=commentRepository.getByMovieId(movieId);
      return comments;
    }

    
    
}
