package com.multi.Product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustSelectTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO c = null;
		try {
			c = biz.get("id33");
			System.out.print("Select OK");
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
