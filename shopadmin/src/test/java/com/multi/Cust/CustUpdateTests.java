package com.multi.Cust;

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
		CustVO obj = new CustVO("id01", "jung","gwangju","pwd22");
		try {
			biz.modify(obj);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
