package com.multi.Cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustUpdateTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO c = new CustVO("id33", "pwd37", "jung");
		try {
			biz.modify(c);
			System.out.print("Modified OK");
			System.out.println(c);
			System.out.println(c.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
