package com.bjsxt.aop;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.bjsxt.aop1.dao.ServiceDao;

@Controller
public class Action {
	@Resource
	private ServiceDao serviceDaoImp;
	
	public void Run(){
		
		serviceDaoImp.Res();
		
		System.out.println("action=====3");
		
	}

}
