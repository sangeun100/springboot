package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVO {
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private int cid;
	private String imgname;
	private String catename;
	private String maincatename;
	public ProductVO(String name, int price, int cid, String imgname) {
		super();
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.imgname = imgname;
	}

}