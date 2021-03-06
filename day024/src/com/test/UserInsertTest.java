package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml"); // 스프링 환경을 메모리에 올린 다음 uservice 불러오기

		Service<String, UserVO> service = // 거꾸로 스프링에서 만들어서 주는 과정 = IoC
				(Service<String, UserVO>) factory.getBean("uservice"); 

		UserVO u = new UserVO("id87", "pwd87", "lee");
		service.register(u);
	}

}
