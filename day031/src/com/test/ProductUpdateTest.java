package com.test;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;


public class ProductUpdateTest {

		public static void main(String[] args) {
			ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

			Service<Integer, ProductVO> service = (Service<Integer, ProductVO>) factory.getBean("pservice");

			ProductVO p = new ProductVO("pants3", 10200, 3.8);
			try {
				service.modify(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
