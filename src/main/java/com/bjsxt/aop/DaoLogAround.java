package com.bjsxt.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/***
 * 环绕通知在前置通知的后面
 * 
 * */

public class DaoLogAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		// TODO Auto-generated method stub
		Method mm=m1.getMethod();
		Object [] arg=m1.getArguments();
		Object obj=m1.getThis();
//		自定义功能
		System.out.println("我是环绕通知的前面");
//		目标方法的调用
		Object ro=mm.invoke(obj, arg);
//		自定义功能
		System.out.println("我是环绕通知的后面");
		
		return ro;
	}

}
