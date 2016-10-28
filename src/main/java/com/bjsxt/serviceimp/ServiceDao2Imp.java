package com.bjsxt.serviceimp;

import com.bjsxt.dao.UserDao1;
import com.bjsxt.service.ServiceDao1;

public class ServiceDao2Imp implements ServiceDao1 {
	private UserDao1 userdao2;

	public UserDao1 getUserdao2() {
		return userdao2;
	}

	public void setUserdao2(UserDao1 userdao2) {
		this.userdao2 = userdao2;
	}

	@Override
	public void Del() {
		System.out.println("ServiceDao2Imp"+"====================");
		userdao2.Run();
	}

}
