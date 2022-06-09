package com.multi.Cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class CateUpdateTests {
	
	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		CateVO obj = new CateVO(1001, "pwd37", 3);
		try {
			biz.modify(obj);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
