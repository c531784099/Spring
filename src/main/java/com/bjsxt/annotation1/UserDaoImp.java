package com.bjsxt.annotation1;

import org.springframework.stereotype.Repository;
//  生成的id  为good
@Repository("good")
public class UserDaoImp implements UserDao {

	@Override
	public void Save() {
		System.out.println("通过注解的方式测试=======");

	}

}
