package com.example.crudSpring;

import com.example.crudSpring.entities.Product;

public class ProductDTO {
	
	private Long id;
	private String name;
	private Integer priceInCents;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		priceInCents = entity.getPriceInCents();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriceInCents() {
		return priceInCents;
	}

	public void setPriceInCents(Integer priceInCents) {
		this.priceInCents = priceInCents;
	}
	
	
}
