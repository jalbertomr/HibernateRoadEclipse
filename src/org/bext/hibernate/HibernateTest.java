package org.bext.hibernate;

import org.bext.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("Primer Usuario");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		
	}

}
