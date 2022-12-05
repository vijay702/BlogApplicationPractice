package com.blog.demo.controller;

import com.blog.demo.dto.CommentDTO;
import com.blog.demo.dto.ResponseCommentDTO;
import com.blog.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{id}/comment")
    public ResponseCommentDTO createComment(@PathVariable(name = "Post_Id") Long id, @RequestBody CommentDTO commentDTO) {
        return commentService.createComment(id,commentDTO);
    }
}
