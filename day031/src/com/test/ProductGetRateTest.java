package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.service.ProductService;
import com.vo.ProductVO;
import com.vo.UserVO;

public class ProductGetRateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
//		Service<Integer,ProductVO> service = 
//				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductService service  =
				(ProductService) factory.getBean("pservice");
		
		
		List<ProductVO> list = null;
		try {
			list = service.getrate(5.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (ProductVO vo : list) {
			System.out.println(vo);
		}
		
	}

}






