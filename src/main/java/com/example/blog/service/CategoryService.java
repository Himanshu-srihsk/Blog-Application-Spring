package com.example.blog.service;

import java.util.List;

import com.example.blog.payloads.CategoryDto;

public interface CategoryService {
	CategoryDto createCatgory(CategoryDto categoryDto);
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	void deleteCategory(Integer categoryId);
	CategoryDto getCategory(Integer categoryId);
	List<CategoryDto> getCategories();
}
