package com.multi.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class CartInsertTest {
	
	@Autowired
	CartBiz biz;

	@Test
	void contextLoads() {
		CartVO obj = new CartVO("id01",1001,6);
		try {
			biz.register(obj);
			System.out.print("Registered OK");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
