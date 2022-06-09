package com.multi.Cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class CateInsertTests {
	
	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		CateVO obj = new CateVO(51,"etc1",50); 
		try {
			biz.register(obj);
			System.out.print("Registered OK");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
