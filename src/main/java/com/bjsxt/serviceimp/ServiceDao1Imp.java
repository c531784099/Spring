package com.bjsxt.serviceimp;


import com.bjsxt.dao.UserDao1;

import com.bjsxt.service.ServiceDao1;

public class ServiceDao1Imp implements ServiceDao1 {
	
	private UserDao1  ud;
	
	public UserDao1 getUd() {
		return ud;
	}
	public void setUd(UserDao1 ud) {
		this.ud = ud;
	}
	@Override
	public void Del() {
		ud.Run();
		System.out.println("Œ“ «ServiceDao1Imp=========");

	}

}
