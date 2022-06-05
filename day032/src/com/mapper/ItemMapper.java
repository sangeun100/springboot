package com.mapper;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(ItemVO obj) throws Exception;
	
	public ItemVO select(int obj) throws Exception;
	public List<ItemVO> selectall() throws Exception;
	public List<ItemVO> searchname() throws Exception;
	
	public List<ItemVO> getPrice(Map<String, Integer> map) throws Exception; // like ���� �޾ƿ���(�� �̻� ����)
	public List<ItemVO> getDate(String date) throws Exception; // ��¥ �޾ƿ��� date.�ڹٷ� �ޱ� �׳� String����

}
