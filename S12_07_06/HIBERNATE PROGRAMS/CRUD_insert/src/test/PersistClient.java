package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.student;

public class PersistClient {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session1=sf.openSession();
		Transaction t=session1.beginTransaction();
		
		
		//create student object
		
		student st=new student();
		st.setId(123);
		st.setName("venkataswamy");
		st.setEmail("venkataswamy611@gmail.com");
		st.setAddress("hyderabad");
		
		
		 session1.persist(st);
		 //save can execute without transaction boundaries
		 //persist can execute with in transaction boundaries
		session1.getTransaction().commit(); 
		//t.commit();//data will execute here
		session1.close();
		sf.close();
		System.out.println("data inserttion success........");
	}
	}

