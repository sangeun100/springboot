package com.multi.produdct;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductInsertTests {
	
	@Autowired
	ProductBiz pbiz;

	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"ppp",999999,null,3.4);
		try {
			pbiz.register(p);
			System.out.print("Registered OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
