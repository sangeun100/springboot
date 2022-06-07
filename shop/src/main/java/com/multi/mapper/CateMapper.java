package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CateVO;
@Mapper
@Repository
public interface CateMapper {
		public void insert(CateVO cust) throws Exception;
		public void delete(int id) throws Exception;
		public void update(CateVO cust) throws Exception;
		public CateVO select(String id) throws Exception;
		public List<CateVO> selectall() throws Exception;
}
