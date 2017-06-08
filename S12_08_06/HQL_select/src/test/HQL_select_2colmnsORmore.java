package test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;


public class HQL_select_2colmnsORmore {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		
		 String sql="select name,email from Employee";
		 Query q=session.createQuery(sql);
		  List<Object> list=q.list();
		  for(Object o:list){
			   Object a[]=(Object[])o;
			   System.out.println(a[0]);
			   System.out.println(a[1]);
		  }
		  
		  t.commit();
		 session.close();
		 sf.close();
		 System.out.println("success");
		}
}
