package com.educandoweb2.course2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb2.course2.entities.Product;

 public interface ProductRepository extends JpaRepository<Product, Long> {

}
