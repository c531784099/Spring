package com.bjsxt.aop2;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImp implements Dao {
	
	public void Save(){
		
		System.out.println("ÎÒÊÇ dao µÄsave========");
	}

}
