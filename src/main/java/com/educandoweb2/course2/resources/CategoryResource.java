package com.educandoweb2.course2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb2.course2.entities.Category;
import com.educandoweb2.course2.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService userService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
