package com.example.blog.service;

import java.util.List;
import com.example.blog.payloads.PostDto;
import com.example.blog.payloads.PostResponse;

public interface PostService {
  PostDto updatePost(PostDto postDto, Integer postId);
  void deletePost(Integer postId);
  PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
  PostDto getPostById(Integer postId);
  List<PostDto> getPostsByCategory(Integer categoryId);
  List<PostDto> getPostsByUser(Integer userId);
  List<PostDto> searchPosts(String keyword);
  PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
}
