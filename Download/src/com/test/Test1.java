package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Dept;
import com.model.Emp;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 加载配置文件和映射文件
		Configuration conf = new Configuration().configure(); 
		// 创建线程安全的session工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 基于线程打开session对象 
		Session session = sf.getCurrentSession();

		try {
		    session.beginTransaction();// 开启事务


//		    Emp obj=session.get(Emp.class, "002");
//		    System.out.println(obj.getName());
//		    System.out.println(obj.getDept().getName());
		    
		    
		    Dept obj=session.get(Dept.class, "02");
		    System.out.println(obj.getName());
		   List<Emp> emps= obj.getEmps();
		   if(emps!=null&&emps.size()>0) {
			  for(Emp e:emps) {
				  System.out.println(e.getName()+e.getJob());
			  }
		   }
		    
		    session.getTransaction().commit();// 提交事务
		} catch (Exception e) {
		    e.printStackTrace();
		    session.getTransaction().rollback();// 回滚事务
		}

		// session.close(); // 可以自动关闭session

	}
}
