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

		Service<String, ProductVO> service = 
				(Service<String, ProductVO>) factory.getBean("pservice");
		List<ProductVO> list = null; //�� ������ ����� ���� Array list�� ���� �� �� �ְԲ� 
		list = service.get();
		
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}
				
	}

}
