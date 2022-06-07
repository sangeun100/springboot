package com.multi.produdct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSelectTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO p = null;
		try {
			p = biz.get(3);
			System.out.print("Select OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
