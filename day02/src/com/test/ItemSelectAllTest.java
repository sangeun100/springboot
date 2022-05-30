package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;
import com.vo.UserVO;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");

		Service<String, ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("iservice");
		List<ItemVO> list = null;
		list = service.get();
		
		for (ItemVO ItemVO : list) {
			System.out.println(ItemVO);
		}
	}

}
