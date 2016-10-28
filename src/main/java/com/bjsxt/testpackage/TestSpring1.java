package com.bjsxt.testpackage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.service.ServiceDao1;

public class TestSpring1 {
	
	@Test
	public  void Test1(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceDao1 sd=(ServiceDao1) ac.getBean("userservice4");	
		sd.Del();
		
		
	}

}
