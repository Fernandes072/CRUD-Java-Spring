package com.example.crudSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudSpring.ProductDTO;
import com.example.crudSpring.ProductPostDTO;
import com.example.crudSpring.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<ProductDTO> findAll(){
		List<ProductDTO> result = productService.findAll();
		return result;
	}
	
	//Deveria verificar o data, mas o @Valid não está funcionando
	@PostMapping
	public ProductDTO insertProduct(@RequestBody ProductPostDTO data) {
		ProductDTO product = productService.save(data);
		return product;
	}
	
	@PutMapping
	public ProductDTO updateProduct(@RequestBody ProductDTO data) {
		ProductDTO product = productService.update(data);
		return product;
	}
	
	@DeleteMapping(value = "/{id}")
	public ProductDTO deleteProduct(@PathVariable Long id) {
		ProductDTO product = productService.delete(id);
		return product;
		
	}
	
	/*@GetMapping
	public ResponseEntity getAllProducts() {
		return ResponseEntity.ok("certo");
	}*/
}