package com.educandoweb2.course2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb2.course2.entities.Order;
import com.educandoweb2.course2.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService userService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
