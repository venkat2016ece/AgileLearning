package org.javabrains.pickzkart.Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.pickzkart.dto.UserDetails;
import org.javabrains.pickzkart.dto.Vehicle;
public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserName("Venkat");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		user.setVehicle(vehicle);
	
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
 		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		
		}
}
			
			 
