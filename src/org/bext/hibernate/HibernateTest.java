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
				
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("carrito");
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Audi");
				
		userDetails.setUserName("Primer Usuario");
		userDetails.getVehicle().add(vehicle1);
		userDetails.getVehicle().add(vehicle2);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(userDetails);
		//session.save(vehicle1);
		//session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		//sessionFactory.close();
	}

}
