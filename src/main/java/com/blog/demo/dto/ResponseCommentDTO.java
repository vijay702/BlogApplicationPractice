package com.blog.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseCommentDTO {
    private Long commentId;
    private String name;
    private String body;
    private ResponsePostDTO responsePostDTO;
}
