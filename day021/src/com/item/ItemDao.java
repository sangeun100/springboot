package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted:"+v);
		
	}

	@Override
	public void delete(String k) {
		System.out.println("Delete:"+k);
		
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("Update:"+v);
		
	}

	@Override
	public ItemVO select(String k) {
		ItemVO item = new ItemVO(k,"500");
		return item;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO("aa1","500"));
		list.add(new ItemVO("aa2","600"));
		list.add(new ItemVO("aa3","700"));
		return list;
	}

}
