package com.multi.Product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSelectAll2Tests {

	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.get2();
			for (ProductVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
