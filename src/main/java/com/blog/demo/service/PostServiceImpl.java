package com.blog.demo.service;

import com.blog.demo.dto.PostDTO;
import com.blog.demo.dto.ResponsePostDTO;
import com.blog.demo.entity.Post;
import com.blog.demo.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponsePostDTO createPost(PostDTO postDTO) {
        ResponsePostDTO responsePostDTO = new ResponsePostDTO();
        Post post = modelMapper.map(postDTO,Post.class);
        Post post1 = postRepository.getPostByTitle(post.getTitle());
        if(post1 !=null){
            responsePostDTO.setHttpMessage("Title Already exist");
            responsePostDTO.setHttpCode("403");
        }
        postRepository.save(post);
        responsePostDTO.setHttpMessage("Post is Successfully Created");
        responsePostDTO.setHttpCode("200 - ok");
        return responsePostDTO;
    }
}
