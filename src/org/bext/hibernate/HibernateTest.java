package org.bext.hibernate;

import java.util.Date;

import org.bext.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		UserDetails userDetails2 = new UserDetails();
		
		//userDetails.setUserId(1);      //generado automaticamente
		userDetails.setUserName("Primer Usuario");
		userDetails.setJoinedDate(new Date());
		userDetails.setAddress("address Primer Usuario");
		userDetails.setDescription("Primer Usuario Descripcion");
		
		//userDetails2.setUserId(2);    //generado automaticamente
		userDetails2.setUserName("Segundo Usuario");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.save(userDetails2);
		session.getTransaction().commit();
		session.close();
		//sessionFactory.close();
	}

}
