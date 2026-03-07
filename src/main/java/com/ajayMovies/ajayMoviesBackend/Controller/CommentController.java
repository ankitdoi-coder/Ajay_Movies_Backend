package com.ajayMovies.ajayMoviesBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.ajayMovies.ajayMoviesBackend.DTO.CommentDTO;
import com.ajayMovies.ajayMoviesBackend.Entity.Comment;
import com.ajayMovies.ajayMoviesBackend.Services.CommentService;


@RestController
@RequestMapping("/api")
public class CommentController {
    
    @Autowired
    CommentService commentService;

    //api to add comment
    @PostMapping("/add-comment")
    public ResponseEntity<Comment> addComment(@RequestBody CommentDTO commentDTO){
        return ResponseEntity.ok(commentService.addComment(commentDTO));
    }
}
