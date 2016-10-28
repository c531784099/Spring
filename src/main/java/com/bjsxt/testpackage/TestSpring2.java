package com.bjsxt.testpackage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.annotation1.UserAction;

public class TestSpring2 {
	
	@Test
	public void Test1(){
		ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction  ua=(UserAction) ac.getBean("userAction");
		UserAction  ua1=(UserAction) ac.getBean("useraction");
		
		
		ua1.AddUser();
		
		
	}

}
