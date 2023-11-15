package com.example.crudSpring;

import com.example.crudSpring.entities.Product;

public class ProductPostDTO {
	
	private String name;
	private Integer priceInCents;
	
	public ProductPostDTO() {
		
	}
	
	public ProductPostDTO(Product entity) {
		name = entity.getName();
		priceInCents = entity.getPriceInCents();
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
