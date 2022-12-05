package com.blog.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;
    private String name;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Post_Id")
    private Post post;
}
