package com.bjsxt.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	
	@Test
	public void Test1(){
		ApplicationContext ac=new 	ClassPathXmlApplicationContext("applicationContext.xml");
		Action  action=(Action) ac.getBean("action");
		action.Run();
		
		
	}

}
