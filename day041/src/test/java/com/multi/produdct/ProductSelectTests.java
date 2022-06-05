package com.multi.produdct;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class ProductSelectTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO Cust = null;
		try {
			Cust = biz.get("id33");
			System.out.print("Select OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
