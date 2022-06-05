package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml"); 

		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice"); 

		ProductVO p = new ProductVO("coat", 20100, 3.3);
		service.register(p);
	}

}
