package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ItemMapper;
import com.vo.ItemVO;

@org.springframework.stereotype.Service("iservice") //@service + annotation
public class ItemService implements Service<Integer, ItemVO> {

	@Autowired
	ItemMapper dao;

	@Override
	public void register(ItemVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public void modify(ItemVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public ItemVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ItemVO> get() throws Exception {
		return dao.selectall();
	}
	public List<ItemVO> searchname() throws Exception {
		return dao.searchname();
	}
	
	public List<ItemVO> getPrice(Map<String, Integer> map) throws Exception {
		return dao.getPrice(map);
	}
	public List<ItemVO> getDate(String date) throws Exception {
		return dao.getDate(date);
	}
}
