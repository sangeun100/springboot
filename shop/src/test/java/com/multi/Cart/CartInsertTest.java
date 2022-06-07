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
		CartVO c = new CartVO(1003,"id03",1002);
		try {
			biz.register(c);
			System.out.print("Registered OK");
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
