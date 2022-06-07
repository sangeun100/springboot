package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CateMapper;
import com.multi.vo.CateVO;

@Service("Catebiz")
public class CateBiz implements Biz<Integer, CateVO>{
	
	@Autowired
	CateMapper dao;

	@Override
	public void register(CateVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(CateVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public CateVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CateVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
