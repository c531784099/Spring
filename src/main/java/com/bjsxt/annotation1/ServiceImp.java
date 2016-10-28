package com.bjsxt.annotation1;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements ServiceInterface {
//	将id 为good  赋值给加注解的属性
	@Resource(name="good")
	private UserDao userDaoImp;

	@Override
	public void Reg() {
		System.out.println("测试注解的 注册 =======");
		
	}

}
