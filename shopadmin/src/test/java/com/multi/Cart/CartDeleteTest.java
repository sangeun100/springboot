package com.multi.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;

@SpringBootTest
class CartDeleteTest {
	
	@Autowired
	CartBiz biz;

	@Test
	void contextLoads() {
		try {
			biz.remove(1000);
			System.out.print("Delete OK");
		} catch (Exception e) {
			System.out.print("Delete FAIL");
			e.printStackTrace();
		}
	}

}
