package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustDeleteTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
//		CustVO c = new CustVO("id22", "pwd22", "kee");
		try {
			biz.remove("id22");
			System.out.print("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
