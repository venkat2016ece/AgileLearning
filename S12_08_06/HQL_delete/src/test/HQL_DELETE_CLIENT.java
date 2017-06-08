package test;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQL_DELETE_CLIENT {
	 public static void main(String[] args) {
				
				Configuration cfg=new Configuration();
				cfg.configure("resources/hibernate.cfg.xml");
			    SessionFactory sf=cfg.buildSessionFactory();
			    Session session=sf.openSession();
			    Transaction t=session.beginTransaction();
				  
			  String hql="delete Student where id=100";
				  Query query=session.createQuery(hql);
				  int i=query.executeUpdate();
				  t.commit();
				  System.out.println(i);
				  session.close();
				  sf.close();
				 System.out.println("success");
				
			}
	}
