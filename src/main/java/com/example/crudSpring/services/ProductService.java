package com.example.crudSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.crudSpring.ProductDTO;
import com.example.crudSpring.ProductPostDTO;
import com.example.crudSpring.entities.Product;
import com.example.crudSpring.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> result = productRepository.findAll();
		List<ProductDTO> dto = result.stream().map(x -> new ProductDTO(x)).toList();
		return dto;
	}
	
	@Transactional
	public ProductDTO save(ProductPostDTO data) {
		Product newProduct = new Product(data);
		productRepository.save(newProduct);
		return new ProductDTO(newProduct);
	}
	
	@Transactional
	public ProductDTO update(ProductDTO data) {
		Product product = productRepository.getReferenceById(data.getId());
		product.setName(data.getName());
		product.setPriceInCents(data.getPriceInCents());
		return new ProductDTO(product);
	}
	
	@Transactional
	public ProductDTO delete(Long id) {
		Product product = productRepository.findById(id).get();
		productRepository.deleteById(id);
		return new ProductDTO(product);
	}

}
