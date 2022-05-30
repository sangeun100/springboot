package com.vo;

import java.sql.Date;

public class ProductVO {
	private Integer id;
	private String name;
	private int price;
	private Date date;
	private String rate;

	public ProductVO() {
		super();
	}

	public ProductVO(Integer id,String	name, int price,Date date,String rate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
		this.rate = rate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + ", rate=" + rate
				+ "]";
	}
	

}