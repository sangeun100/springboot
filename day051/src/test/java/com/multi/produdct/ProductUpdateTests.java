package com.multi.produdct;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductUpdateTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"aaa",88888,null,3.8);
		try {
			biz.modify(p);
			System.out.print("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
