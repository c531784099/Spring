package com.bjsxt.annotation1;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements ServiceInterface {
//	��id Ϊgood  ��ֵ����ע�������
	@Resource(name="good")
	private UserDao userDaoImp;

	@Override
	public void Reg() {
		System.out.println("����ע��� ע�� =======");
		
	}

}
