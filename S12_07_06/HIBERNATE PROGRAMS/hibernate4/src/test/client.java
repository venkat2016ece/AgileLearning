package test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.student;

public class client {

	public static void main(String[] args) {
  student st=new student();
  st.setId(100);
  st.setName("venkat");
  st.setEmail("venkataswamy611@gmail.com");
  st.setMarks(614);
	
//student object state is transient
	Configuration cfg=new Configuration();
	cfg=cfg.configure("resources/hibernate.cfg.xml");
  SessionFactory sf=cfg.buildSessionFactory();
  Session s=sf.openSession();
  Transaction t=s.beginTransaction();
  
  s.save(st);
  //student object state is persistent state
  s.getTransaction().commit();
  //student object will move to DB
  //s.evict(st);
  
  s.close();
  sf.close();
  //student object detached state
  //student object will remove from persistent state
  //then gc can collect your student object
  System.out.println("inserted successfull");

	 
	
	
}
}
