package com.multi.vo;

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
public class CateVO {
	private int id;
	private String name;
	private int pid; //상위 카테고리의 id
	public CateVO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}