package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml"); // 스프링 환경을 메모리에 올린 다음 uservice 불러오기

		Service<String, ProductVO> service = // 거꾸로 스프링에서 만들어서 주는 과정 = IoC
				(Service<String, ProductVO>) factory.getBean("pservice"); 

		ProductVO p = new ProductVO("coat", 20100, "4.2");
		service.register(p);
	}

}
