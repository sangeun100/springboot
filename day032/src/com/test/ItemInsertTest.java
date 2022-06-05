package com.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Service<String, ItemVO> service = (Service<String, ItemVO>) factory.getBean("iservice");

		ItemVO i = new ItemVO("coat",8,"jk");
		try {
			service.register(i);
		} catch (Exception e) {
			System.out.println("입력 오류가 발생 하였습니다.");
			// e.printStackTrace();
		}
	}

}
