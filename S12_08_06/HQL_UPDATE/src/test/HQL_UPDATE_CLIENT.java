package test;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQL_UPDATE_CLIENT {
	 public static void main(String[] args) {
				
				Configuration cfg=new Configuration();
				cfg.configure("resources/hibernate.cfg.xml");
			    SessionFactory sf=cfg.buildSessionFactory();
			    Session session=sf.openSession();
			    Transaction t=session.beginTransaction();
				 
				  //String hql="update Student set name='venkat',email='venkatswamy611@gmail.com' where id=111";
			  //String hql="update Student set id=333 where id=111";
			  String hql="update Student set email='abc@gmail.com' where id=333";
				  Query query=session.createQuery(hql);
				  int i=query.executeUpdate();
				  t.commit();
				  System.out.println(i);
				  session.close();
				  sf.close();
				 System.out.println("success");
				
			}
	}
