package test;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;


public class HQL_1row_select {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	
	
	 String sql="from Employee where id=101";
	 Query q=session.createQuery(sql);
	 Employee emp=(Employee)q.uniqueResult();
	 System.out.println(emp.getId());
	 System.out.println(emp.getName());
	 System.out.println(emp.getEmail());
	 System.out.println(emp.getSalary());
	
	 
	 t.commit();
	 
	 session.close();
	 sf.close();
	 System.out.println("success");
	}
}
