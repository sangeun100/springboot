package com.multi.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductUpdateTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO("bang",10100,14,"3.jpg");
		try {
			biz.modify(obj);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
