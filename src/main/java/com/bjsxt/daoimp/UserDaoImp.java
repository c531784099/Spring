package com.bjsxt.daoimp;

import java.util.List;

import com.bjsxt.dao.UserDao;

public class UserDaoImp implements UserDao {
	
	private String type;
	private Integer uid;
	private List list;
	

	public List getList() {
		return list;
	}


	public void setList(List list) {
		this.list = list;
	}


	public Integer getUid() {
		return uid;
	}


	public void setUid(Integer uid) {
		this.uid = uid;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public void SaveUser() {
		System.out.println("SaveUser======="+type+"=="+uid);

	}

}
