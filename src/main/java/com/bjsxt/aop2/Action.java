package com.bjsxt.aop2;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
//ע�ⷽʽע��
@Controller
public class Action {
	@Resource
	private  ServiceDao  ServiceImp;
	
	public void Run(){
		ServiceImp.Res();;
		System.out.println("=====action");
		
	}

}
