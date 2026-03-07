package com.ajayMovies.ajayMoviesBackend.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private String name;
    private String comment;
    private LocalDateTime createdAt;
    private Long movieId;
}
