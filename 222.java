package com.offcn;

import java.util.Date;

public class UserServiceRestImp implements UserService {

	@Override
	public User get(String id) {
		
		System.out.println("get方法"+id);
		User u =new User("1", "张三", "123", 1, new Date());
		return u;
	}

	@Override
	public User put(String id, User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User post(String id, User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
