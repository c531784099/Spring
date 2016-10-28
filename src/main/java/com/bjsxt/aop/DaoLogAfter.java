package com.bjsxt.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DaoLogAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("我是后置通知========="+"返回值："+arg0+"  方法： "+arg1+" 参数： "+arg2+"  对象 "+arg3);

	}

}
