package com.bjsxt.annotation1;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
	@Resource
	private ServiceInterface ServiceImp;
	
	public void init(){
		
		System.out.println("���� init  action=====");
	}
	public  void AddUser(){
		System.out.println("action====");
		
		ServiceImp.Reg();
	}
	
	public void destory(){
		
		System.out.println("����  destory=======");
	}

}
