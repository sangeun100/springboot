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
		//(NULL, 'levis',10000,curdate(),11,'a.jpg')
		ProductVO obj = new ProductVO("hat3",17000,31,"3.jpg");
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


