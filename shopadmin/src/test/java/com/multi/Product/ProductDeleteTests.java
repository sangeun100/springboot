package com.multi.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class ProductDeleteTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		try {
			biz.remove("id22");
			System.out.print("Delete OK");
		} catch (Exception e) {
			System.out.print("Delete FAIL");
			e.printStackTrace();
		}
	}

}
