package com.multi.Main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;

@SpringBootTest
class ProductCountTest {

	@Autowired
	MainBiz biz;

	@Test
	void contextLoads() {
		int count;
		try {
			count = biz.getProductCnt();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
