package com.multi.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductInsertTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO("shirts1",10000,10,"3.jpg");
		try {
			biz.register(obj);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
