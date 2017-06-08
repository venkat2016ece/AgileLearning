package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class ClientInsert {
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure("resources/hibernate.cfg.xml");
	//cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	OldStudent os1=new OldStudent(111,"abc","venakat1@gmail.com","hyd");
	OldStudent os2=new OldStudent(222,"cdf","venakat2@gmail.com","bnglr");
	OldStudent os3=new OldStudent(333,"ghi","venakat3@gmail.com","mumbai");
	
	session.save(os1);
	session.save(os2);
	session.save(os3);
	transaction.commit();
	session.close();
	sf.close();
	System.out.println("successfully inserted");
}

}
