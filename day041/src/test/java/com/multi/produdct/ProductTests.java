package com.multi.produdct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.ProductVO;

@SpringBootTest
class ProductTests {

	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"qqq",88888,null,3.4);
		System.out.println(p);
		System.out.println(p.getName());
	}

}
