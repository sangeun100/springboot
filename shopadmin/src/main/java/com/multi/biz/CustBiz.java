package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CustMapper;
import com.multi.vo.CustVO;

@Service
public class CustBiz implements Biz<String, CustVO>{
	
	@Autowired
	CustMapper dao;
	
	@Override
	public void register(CustVO v) throws Exception {
		// 데이터 검증 Service가 하는 역할(데이터 검증, 체크, 트렌잭션 처리)
		dao.insert(v);
		// 메일전송
	}

	@Override
	public void modify(CustVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public CustVO get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CustVO> get() throws Exception {
		return dao.selectall();
	}

}
