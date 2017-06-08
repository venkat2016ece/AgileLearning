package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg=cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	Employee emp1=new Employee(101,"venkat","venkat@gmail.com","5000");
	Employee emp2=new Employee(102,"abc","abgt@gmail.com","4000");
	Employee emp3=new Employee(103,"def","vghght@gmail.com","7000");
	Employee emp4=new Employee(105,"ghi","vgngnt@gmail.com","8000");
	Employee emp5=new Employee(10,"jkl","vwhrfgmail.com","6000");
	session.save(emp1);
	session.save(emp2);
	session.save(emp3);
	session.save(emp4);
	session.save(emp5);
	t.commit();
	session.close();
	sf.close();
	}
}
