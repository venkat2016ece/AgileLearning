package test;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_TABLE_TABLE {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("resources/hibernate.cfg.xml");
		//cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="insert into NewStudent(id,name,email,address)select id,s.name,s.email,s.address from OldStudent s";
		Query q=session.createQuery(hql);
		int i=q.executeUpdate();
		 System.out.println("number of rows dump from old new table"+i);
		session.close();
		sf.close();
		System.out.println("successfully inserted");
	}

}
