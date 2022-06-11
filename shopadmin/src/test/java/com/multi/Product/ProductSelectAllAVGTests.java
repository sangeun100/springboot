package com.multi.Product; // my sql에서 productAVG 추가 해야함

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSelectAllAVGTests {

	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			for (ProductVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
