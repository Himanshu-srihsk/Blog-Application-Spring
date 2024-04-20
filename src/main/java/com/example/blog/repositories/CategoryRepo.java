package com.example.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
   
}
