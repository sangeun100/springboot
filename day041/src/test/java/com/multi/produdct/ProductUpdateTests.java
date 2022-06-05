package com.multi.produdct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class ProductUpdateTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO c = new CustVO("id33", "pwd32", "jang");
		try {
			biz.modify(c);
			System.out.print("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
