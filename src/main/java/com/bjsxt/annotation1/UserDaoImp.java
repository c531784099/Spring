package com.bjsxt.annotation1;

import org.springframework.stereotype.Repository;
//  ���ɵ�id  Ϊgood
@Repository("good")
public class UserDaoImp implements UserDao {

	@Override
	public void Save() {
		System.out.println("ͨ��ע��ķ�ʽ����=======");

	}

}
