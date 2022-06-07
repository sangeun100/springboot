package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductVO;
@Mapper
@Repository
public interface ProductMapper {

	public void insert(ProductVO cust) throws Exception;
	public void delete(String id) throws Exception;
	public void update(ProductVO cust) throws Exception;
	public ProductVO select(String id) throws Exception;
	public List<ProductVO> selectall() throws Exception;
}
