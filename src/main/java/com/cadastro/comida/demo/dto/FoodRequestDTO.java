package com.cadastro.comida.demo.dto;

public class FoodRequestDTO {

	private String title;
	private String image;
	private Integer price;
	public FoodRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodRequestDTO(String title, String image, Integer price) {
		super();
		this.title = title;
		this.image = image;
		this.price = price;
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
