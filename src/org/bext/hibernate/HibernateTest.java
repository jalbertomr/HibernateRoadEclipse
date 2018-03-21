package org.bext.hibernate;

import org.bext.dto.Address;
import org.bext.dto.UserDetails;
import org.bext.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		UserDetails userDetails2 = new UserDetails();
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("carrito");
				
		userDetails.setUserName("Primer Usuario");
		userDetails.setVehicle(vehicle1);
		userDetails2.setUserName("Segundo Usuario");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.save(userDetails2);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
		
		//sessionFactory.close();
	}

}
