package com.test;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductUpdateTest {

		public static void main(String[] args) {
			ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

			Service<String, ProductVO> service = (Service<String, ProductVO>) factory.getBean("pservice");

			ProductVO p = new ProductVO(null,"pants", 10200, Date, "3.8");
			service.modify(p);

	}

}
