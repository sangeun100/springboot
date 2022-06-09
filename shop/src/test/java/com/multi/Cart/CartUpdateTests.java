package com.multi.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class CartUpdateTests {
	
	@Autowired
	CartBiz biz;

	@Test
	void contextLoads() {
		CartVO obj = new CartVO("id01", 1001, 2);
		try {
			biz.modify(obj);
			System.out.println(obj);
			System.out.println(obj.getCatename());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
