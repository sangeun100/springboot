package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;


public class ItemUpdateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("iservice");
		
		ItemVO i = new ItemVO("pants2", 13151, "imgname9");
		try {
			service.modify(i);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}
	}

}






