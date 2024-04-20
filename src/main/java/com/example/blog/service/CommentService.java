package com.example.blog.service;

import com.example.blog.payloads.CommentDto;

public interface CommentService {
  CommentDto createComment(CommentDto commentDto,Integer postId);
  void deleteComment(Integer commentId);
}
