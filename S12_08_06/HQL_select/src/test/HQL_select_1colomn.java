package test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQL_select_1colomn {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	
	
	 String sql="select name from Employee";
	 Query q=session.createQuery(sql);
	  List<String> list=q.list();
	  for(String name:list)
		  System.out.println(name);
	
	  
	  t.commit();
	 session.close();
	 sf.close();
	 System.out.println("success");
	}
}
