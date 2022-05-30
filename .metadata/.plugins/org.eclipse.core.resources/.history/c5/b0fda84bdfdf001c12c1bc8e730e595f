package com.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.UserVO;

@Repository("userDao") //userdao로 자동으로 스캔할 수 있는 클래스가 됌 = 스프링 컴포넌트로 만들어 주는 
public class UserDao implements Dao<String, UserVO> {

	@Override
	public void insert(UserVO v) {
		System.out.println("Inserted:"+v);
		
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted:"+k);		
	}

	@Override
	public void update(UserVO v) {
		System.out.println("Updated:"+v);
		
	}

	@Override
	public UserVO select(String k) {
		UserVO user = new UserVO(k,"pwd02","kim");
		return user;
	}

	@Override
	public List<UserVO> select() {
		ArrayList<UserVO> list = new ArrayList<UserVO>(); //바구니 Array list 공간을 만들고 그 안에 여러개 객체 담기
		list.add(new UserVO("id01","pwd01","lee"));
		list.add(new UserVO("id02","pwd02","kim"));
		list.add(new UserVO("id03","pwd03","goo"));
		list.add(new UserVO("id04","pwd04","hoo"));
		list.add(new UserVO("id05","pwd05","na"));
		return list;
	}

}
