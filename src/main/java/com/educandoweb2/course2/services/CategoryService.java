package com.educandoweb2.course2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb2.course2.entities.Category;
import com.educandoweb2.course2.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> findAll() {
		return userRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = userRepository.findById(id);
		return obj.get();
	}
}
