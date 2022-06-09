package com.multi.Cust;

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
		CustVO obj = new CustVO("id16", "kim", "seoul","pwd03");
		try {
			biz.register(obj);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
