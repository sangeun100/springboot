package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		ItemService service = (ItemService) factory.getBean("iservice");

		List<ItemVO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿À·ù");
		}

		for (ItemVO itemVO : list) {
			System.out.println(itemVO);
		}

	}
}
