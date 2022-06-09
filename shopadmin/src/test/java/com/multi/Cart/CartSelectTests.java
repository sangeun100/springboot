package com.multi.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class CartSelectTests {
	
	@Autowired
	CartBiz biz;

	@Test
	void contextLoads() {
		CartVO obj = null;
		try {
			obj = biz.get(1001);
			System.out.print("Select OK");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
