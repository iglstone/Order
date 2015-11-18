package com.order.pojo;

public class Dish {
	private int id;
	private float price;
	private String name;
	private String mapURL;
	
	public Dish() {
		this.id = 0;
		this.price = 0.00F;
		this.name = null;
		this.mapURL = null;
	}
	
	public Dish(int id, float price, String name, String mapURL) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.mapURL = mapURL;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMapURL() {
		return mapURL;
	}
	public void setMapURL(String mapURL) {
		this.mapURL = mapURL;
	}
}
