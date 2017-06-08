package test;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session session=sf.openSession();
    Transaction t=session.beginTransaction();
	 
	 Student st=new Student(5555,"LMN","LMN@gmail.com");
	 session.save(st);
	 t.commit();
	 session.close(); 
	 sf.close();
	 System.out.println("success");
	
}
}
