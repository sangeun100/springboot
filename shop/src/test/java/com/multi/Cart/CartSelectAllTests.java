package com.multi.Cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;
import com.multi.vo.CustVO;

@SpringBootTest
class CartSelectAllTests {

	@Autowired
	CartBiz biz;

	@Test
	void contextLoads() {
		List<CartVO> list = null;
		try {
			list = biz.get();
			for (CartVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
