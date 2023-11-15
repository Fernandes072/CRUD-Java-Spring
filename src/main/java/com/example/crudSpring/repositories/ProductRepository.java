package com.example.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
