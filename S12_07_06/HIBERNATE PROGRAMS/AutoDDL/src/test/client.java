package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.course;
import beans.department;
import beans.employee;
import beans.student;

public class client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		//cfg.buildSessionFactory();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		course c=new course();
		c.setCid(111);
		c.setCname("venkat");
		c.setFee("500");
		
		department d=new department();
		d.setDid(222);
		d.setDname("electrical");
		
		employee e=new employee();
		e.setId(414);
		e.setName("naresh");
		e.setEmail("naresh123@gmail.com");
		
		student s=new student();
		s.setId(417);
		s.setName("suresh");
		s.setEmail("suresh123@gmail.com");
		
		 
		session.save(c);
		session.save(d);
		session.save(e);
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
		System.out.println("insertion success");
		
		
		
	}

}
