package com.bjsxt.aop;

import org.springframework.stereotype.Repository;

import com.bjsxt.aop1.dao.UserDao;

@Repository
public class UserDaoImp implements UserDao {

	@Override
	public void Save() {
		System.out.println("数据库中的save====1");
//		throw new RuntimeException();
		
		
	}

	@Override
	public void Out() {
		System.out.println("===dao层的   out方法1");
		
	}

}
