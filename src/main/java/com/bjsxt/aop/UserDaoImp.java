package com.bjsxt.aop;

import org.springframework.stereotype.Repository;

import com.bjsxt.aop1.dao.UserDao;

@Repository
public class UserDaoImp implements UserDao {

	@Override
	public void Save() {
		System.out.println("���ݿ��е�save====1");
//		throw new RuntimeException();
		
		
	}

	@Override
	public void Out() {
		System.out.println("===dao���   out����1");
		
	}

}
