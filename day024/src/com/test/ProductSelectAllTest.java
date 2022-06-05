package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");

		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		List<ProductVO> list = null; //빈 깡통을 만들어 놓고 Array list가 리턴 될 수 있게끔 
		list = service.get();
		
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}
				
	}

}
