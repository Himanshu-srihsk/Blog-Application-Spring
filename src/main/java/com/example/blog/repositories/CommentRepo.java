package com.example.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
