package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.student;

public class MergeTest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		
		session.get(student.class, 111);
		//whenever ur using this method it will fetch one record into session object.it gives an error in this case u need to go to merge method 
		
		student st=new student();
		st.setId(124);
		st.setName("naresh");
		st.setEmail("venkataswamy611@ymail.com");
		st.setAddress("chennai");
		session.merge(st);
		t.commit();
		session.close();
		System.out.println("update success....");
		
	}
	}

