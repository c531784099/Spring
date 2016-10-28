package com.bjsxt.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/***
 * ����һ��ͨ��ע��ʵ�ֵ���ǿ�ࡣ
 * 
 * */
//@Aspect
@Component
public class DaoLog {
//	@Before(value = "execution(* com.bjsxt.aop2.*.*(..))")
	public void before(){
		
		System.out.println("before===");
	}
//	@After(value = "execution(* com.bjsxt.aop2.*.*(..))")
	public void after(){
		
		System.out.println("after=====");
	}
//	������Ի��  �����ķ���ֵ����after��around  ��ǿ������档
//	@AfterReturning(pointcut="execution(* com.bjsxt.aop2.*.*(..))",returning="rr")
	public void after1(Object rr){
		System.out.println("after1===="+rr);
		
	}
	
//	@Around(value = "execution(* com.bjsxt.aop2.*.*(..))")
	public void around(ProceedingJoinPoint jp){
		
		System.out.println("around=======qian");
		
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aroud====hou");
		
		
		
		
	}

}
