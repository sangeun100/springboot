package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml"); // ������ ȯ���� �޸𸮿� �ø� ���� uservice �ҷ�����

		Service<String, UserVO> service = // �Ųٷ� ���������� ���� �ִ� ���� = IoC
				(Service<String, UserVO>) factory.getBean("uservice"); 

		UserVO u = new UserVO("id87", "pwd87", "lee");
		service.register(u);
	}

}