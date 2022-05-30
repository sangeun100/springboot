package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;
import com.vo.UserVO;

public class ItemInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");

		Service<String, ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("iservice");
		ItemVO i = new ItemVO("aa1","500");
		service.register(i);
	}

}
