package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");

		Service<String, UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
		List<UserVO> list = null; //�� ������ ����� ���� Array list�� ���� �� �� �ְԲ� 
		list = service.get();
		
		for (UserVO userVO : list) {
			System.out.println(userVO);
		}
				
	}

}
