package com.bjsxt.aop2;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements ServiceDao {
	@Resource
	private Dao daoImp;

	@Override
	public void Res() {
		daoImp.Save();
		System.out.println("ServiceImp======");
		
	}

}
