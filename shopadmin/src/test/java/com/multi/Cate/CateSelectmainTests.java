package com.multi.Cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class CateSelectmainTests {

	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		List<CateVO> list = null;
		try {
			list = biz.getmain();
			for (CateVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
