package com.cadastro.comida.demo.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cadastro.comida.demo.dto.FoodRequestDTO;

@Table(name = "foods")
@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String title;
	private String image;
	private Integer price;
	
	
	public Food(FoodRequestDTO data) {
		this.image=data.getImage();
		this.price=data.getPrice();
		this.title=data.getTitle();
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
		Food other = (Food) obj;
		return Objects.equals(id, other.id);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String title, Integer price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
