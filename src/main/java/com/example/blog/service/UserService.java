package com.example.blog.service;

import java.util.List;

import com.example.blog.payloads.UserDto;

public interface UserService {
	UserDto registerNewuser(UserDto user);
  UserDto createUser(UserDto user);
  UserDto updateUser (UserDto user, Integer userId);
  UserDto getUserById(Integer userId);
  List<UserDto> getAllUsers();
  void deleteUser(Integer userId);
}
