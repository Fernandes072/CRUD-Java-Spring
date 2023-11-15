package com.example.crudSpring.entities;

import java.util.Objects;

import com.example.crudSpring.ProductPostDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String name;
	
	@Column(name = "price_in_cents")
	private Integer priceInCents;
	
	public Product() {
		
	}

	public Product(Long id, String name, Integer priceInCents) {
		this.id = id;
		this.name = name;
		this.priceInCents = priceInCents;
	}
	
	public Product(ProductPostDTO productPostDTO) {
		this.name = productPostDTO.getName();
		this.priceInCents = productPostDTO.getPriceInCents();
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
}
