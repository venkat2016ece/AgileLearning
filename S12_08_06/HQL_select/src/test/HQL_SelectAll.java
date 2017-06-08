package test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;


public class HQL_SelectAll {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		
		 String sql="from Employee";
		 Query q=session.createQuery(sql);
		  List<Employee> list=q.list();
		  for(Employee emp:list){
			    System.out.println("===================================================");
			   System.out.println("ID"+emp.getId());
			   System.out.println("NAME"+emp.getName());
			   System.out.println("EMAIL"+emp.getEmail());
			   System.out.println("SALARY"+emp.getSalary());
		  }
		  
		  t.commit();
		 session.close();
		 sf.close();
		}
}
