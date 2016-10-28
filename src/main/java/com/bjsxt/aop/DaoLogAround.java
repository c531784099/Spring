package com.bjsxt.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/***
 * ����֪ͨ��ǰ��֪ͨ�ĺ���
 * 
 * */

public class DaoLogAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		// TODO Auto-generated method stub
		Method mm=m1.getMethod();
		Object [] arg=m1.getArguments();
		Object obj=m1.getThis();
//		�Զ��幦��
		System.out.println("���ǻ���֪ͨ��ǰ��");
//		Ŀ�귽���ĵ���
		Object ro=mm.invoke(obj, arg);
//		�Զ��幦��
		System.out.println("���ǻ���֪ͨ�ĺ���");
		
		return ro;
	}

}
