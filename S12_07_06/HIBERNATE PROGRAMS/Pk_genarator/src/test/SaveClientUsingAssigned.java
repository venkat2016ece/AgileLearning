package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BookMovie;

public class SaveClientUsingAssigned {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		BookMovie m=new BookMovie();
		m.setId(1);
		m.setMovie("bahubali");
		m.setSeatno(29);
		m.setShowtime("6pm");
		
		
		
		int pk=(Integer)session.save(m);
		t.commit();
		session.close();
		sf.close();
		System.out.println("insertion success");
		}

}
