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
//		save()����֮ǰ�����  ǰ�÷���
		userDaoImp.Save();
//		����  out()����ǰ�����   ǰ�÷�����
		userDaoImp.Out();

      System.out.println("ע��ҵ��===========2");
		
	}

}
