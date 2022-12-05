package com.blog.demo.service;

import com.blog.demo.dto.CommentDTO;
import com.blog.demo.dto.ResponseCommentDTO;
import com.blog.demo.dto.ResponsePostDTO;
import com.blog.demo.entity.Comment;
import com.blog.demo.entity.Post;
import com.blog.demo.repository.CommentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ResponseCommentDTO createComment(Long id, CommentDTO commentDTO) {
        ResponseCommentDTO responseCommentDTO = new ResponseCommentDTO();
        ResponsePostDTO responsePostDTO = new ResponsePostDTO();
        Comment comment = modelMapper.map(commentDTO,Comment.class);
        if(commentRepository.findById(id).isPresent()){
           commentRepository.save(comment);
           responseCommentDTO.getBody();
           responseCommentDTO.getName();
           responsePostDTO.setHttpMessage("Comment given for the Post");
           responseCommentDTO.setResponsePostDTO(responsePostDTO);
           return responseCommentDTO;
        }
        responsePostDTO.setHttpMessage("The Wrong post id ");
        responsePostDTO.setHttpCode(" 400 - Bad Request");
        responseCommentDTO.setResponsePostDTO(responsePostDTO);
        return responseCommentDTO;
    }
}
