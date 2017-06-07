package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.student;

public class UpdateTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	
	
	//session.get(Student.class, 111);
	//whenever ur using this method it will fetch one record into session object.it gives an error in this case u need to go to merge method 
	
	student st=new student();
	st.setId(123);
	st.setName("naresh");
	st.setEmail("venkataswamy611@gmail.com");
	st.setAddress("hyd");
	session.update(st);
	t.commit();
	session.close();
	System.out.println("update success....");
	
}
}
