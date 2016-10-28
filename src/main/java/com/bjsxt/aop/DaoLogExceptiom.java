package com.bjsxt.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class DaoLogExceptiom implements ThrowsAdvice {
	public void afterThrowing( Method arg0, Object[] arg1,Object arg2,
			RuntimeException  arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("-------------------exceptionLog\t"+arg0+"\t"+arg1+"\t"+arg2+"\t"+arg3);

}
}
