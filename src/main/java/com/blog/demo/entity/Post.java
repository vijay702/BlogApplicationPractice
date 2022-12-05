package com.blog.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name =" Post ")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Post_Id")
    private Long id;
    @Column(name ="Title")
    private String title;
    @Column(name = "Description")
    private String description;
    @Column(name = "Context")
    private String context;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Post_Id")
    private Set<Comment> comment;
}
