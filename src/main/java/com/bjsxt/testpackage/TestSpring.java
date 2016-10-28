package com.bjsxt.testpackage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDao;
import com.bjsxt.service.ServiceDao;

public class TestSpring {
	
	@Test
	public void Test1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao ud=(UserDao) ac.getBean("userdao");
		ud.SaveUser();
		
		
	}
	
	@Test
	public void Test2(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceDao sd0=(ServiceDao) ac.getBean("userservice");
//		ServiceDao sd=(ServiceDao) ac.getBean("userservice2");
//		应用层 调用业务层的方法。
		sd0.Reg();
		
		
	}

}
