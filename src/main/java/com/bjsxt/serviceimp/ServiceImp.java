package com.bjsxt.serviceimp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.bjsxt.dao.UserDao;
import com.bjsxt.daoimp.UserDaoImp;
import com.bjsxt.service.ServiceDao;

public class ServiceImp implements ServiceDao {
    private UserDao ud;
    private List list1;
    private Set set1;
    private Map map1;
    private Properties pro;
	
    public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	public Map getMap1() {
		return map1;
	}
	public void setMap1(Map map1) {
		this.map1 = map1;
	}
	public Set getSet1() {
		return set1;
	}
	public void setSet1(Set set1) {
		this.set1 = set1;
	}
	public List getList1() {
		return list1;
	}
	public void setList1(List list1) {
		this.list1 = list1;
	}
	public UserDao getUd() {
		return ud;
	}
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	public ServiceImp() {
		super();
	}
//	带参数的构造方法   适用于  构造器注入。
	public ServiceImp(UserDao ud) {
		super();
		this.ud = ud;
	}
	@Override
	public void Reg() {
		
		ud.SaveUser();
		System.out.println("我是业务层的  注册业务=====");
//		测试list
		System.out.println("测试list=================================");
		Object obj=list1.get(0);
		UserDaoImp udi=(UserDaoImp)obj;
		System.out.println(udi.getType());		
		System.out.println(list1.get(1).toString());
		System.out.println("测试set=========================");
		
		
//		获取set集合中的数据
		Iterator iter=set1.iterator();
		while(iter.hasNext()){
			Object obj1=iter.next();
			UserDaoImp udi1=(UserDaoImp) obj1;
			System.out.println(udi1.getUid());
			System.out.println(iter.next());
			System.out.println(iter.next());
			
		}
//		获取map中的数据
		System.out.println("测试map中的数据===============================");
		Object obj2=map1.get("k1");//这里是string类型的数据
		System.out.println(obj2);
		Object obj3=map1.get("k2");
		UserDaoImp udi3=(UserDaoImp)obj3;
		System.out.println(udi3.getType());
		
//		测试properties
		System.out.println("测试properties中的数据==================");
		System.out.println(pro.getProperty("k1"));
		System.out.println(pro.getProperty("h1"));
		System.out.println(pro.getProperty("j1"));
		
		
	}

}
