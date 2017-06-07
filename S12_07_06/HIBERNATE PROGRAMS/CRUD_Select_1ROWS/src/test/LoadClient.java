package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class LoadClient {public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	
	
	
	Object o=session.load(Student.class, 124); 
	Student st=(Student)o;
	System.out.println(st.getId());
	System.out.println(st.getName());
	System.out.println(st.getEmail());
	System.out.println(st.getAddress());
	
	
	 
	session.close();
	sf.close();
	System.out.println("select success");
	
	
}

}

