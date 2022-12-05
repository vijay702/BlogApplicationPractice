package com.blog.demo.repository;

import com.blog.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post,Long> {
   @Query("select u.id from Post u where u.title = ?1")
    Post getPostByTitle(String title);
}
