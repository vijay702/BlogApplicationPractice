package com.blog.demo.controller;

import com.blog.demo.dto.PostDTO;
import com.blog.demo.dto.ResponsePostDTO;
import com.blog.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/create")
    public ResponsePostDTO createPost(@RequestBody PostDTO postDTO) {
        return postService.createPost(postDTO);
    }

}
