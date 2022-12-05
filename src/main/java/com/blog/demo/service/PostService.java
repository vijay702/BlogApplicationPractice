package com.blog.demo.service;

import com.blog.demo.dto.PostDTO;
import com.blog.demo.dto.ResponsePostDTO;

public interface PostService {
    ResponsePostDTO createPost(PostDTO postDTO);
}
