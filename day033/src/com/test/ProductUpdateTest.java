package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductUpdateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,ProductVO> service = 
				(Service<String, ProductVO>) factory.getBean("pservice");
		
		ProductVO p = new ProductVO("pants2", 13151, 20);
		try {
			service.modify(p);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}
	}

}






