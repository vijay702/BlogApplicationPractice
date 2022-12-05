package com.blog.demo.service;

import com.blog.demo.dto.CommentDTO;
import com.blog.demo.dto.ResponseCommentDTO;

public interface CommentService {
    ResponseCommentDTO createComment(Long id, CommentDTO commentDTO);
}
