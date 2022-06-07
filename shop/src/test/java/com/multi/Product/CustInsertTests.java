package com.multi.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustInsertTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO c = new CustVO("id37", "pwd33", "kee");
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
