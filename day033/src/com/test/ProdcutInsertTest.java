package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProdcutInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Service<Integer, ProductVO> service = (Service<Integer, ProductVO>) factory.getBean("pservice");

		ProductVO i = new ProductVO("panats05",10200,10);
		try {
			service.register(i);
		} catch (Exception e) {
			System.out.println("�Է� ������ �߻� �Ͽ����ϴ�.");
			// e.printStackTrace();
		}
	}

}
