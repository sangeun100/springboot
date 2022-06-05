package com.multi.produdct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;



@SpringBootTest
class ProductDeleteTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		try {
			biz.remove(2);
			System.out.print("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
