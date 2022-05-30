package com.vo;

public class ItemVO {
	private String name;
	private String price;
	public ItemVO() {
		super();
	}
	public ItemVO(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemVO [name=" + name + ", price=" + price + "]";
	}
	
	
}
