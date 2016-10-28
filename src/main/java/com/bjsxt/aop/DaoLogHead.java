package com.bjsxt.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DaoLogHead implements MethodBeforeAdvice {
//前置通知
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("我是前置通知========"+" 方法：  "+arg0+"参数  "+arg1+"  对象 "+arg2);

	}

}
