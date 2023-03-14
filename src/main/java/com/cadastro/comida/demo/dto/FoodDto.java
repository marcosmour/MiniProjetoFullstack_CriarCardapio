package com.cadastro.comida.demo.dto;

import java.util.UUID;

import com.cadastro.comida.demo.model.Food;

public class FoodDto {

	private UUID id;
	private String title;
	private String image;
	private Integer price;
	
	public FoodDto(Food food) {
		this(food.getId(),food.getImage(), food.getPrice(), food.getPrice());
	}
	public FoodDto(UUID uuid, String string, Integer integer, Integer integer2) {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodDto(String title, String image, Integer price) {
		super();
		this.title = title;
		this.image = image;
		this.price = price;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
