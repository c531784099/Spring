package com.bjsxt.aop;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.aop1.dao.ServiceDao;
import com.bjsxt.aop1.dao.UserDao;

@Service
public class ServiceDaoImp  implements ServiceDao{
	
	@Resource	
	private UserDao userDaoImp;
	@Override
	public void Res() {
//		save()方法之前会调用  前置方法
		userDaoImp.Save();
//		调用  out()方法前会调用   前置方法。
		userDaoImp.Out();

      System.out.println("注册业务===========2");
		
	}

}
