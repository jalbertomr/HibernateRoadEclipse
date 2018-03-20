package org.bext.hibernate;

import java.util.Date;

import org.bext.dto.Address;
import org.bext.dto.LoginName;
import org.bext.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		Address addr1 = new Address();
		addr1.setStreet("calle 10");
		addr1.setCity("Mexico");
		addr1.setState("DF");
		addr1.setPinCode("32123");
		
		Address addr2 = new Address();
		addr2.setStreet("Miguel Hidalgo");
		addr2.setCity("San Miguel de Allende");
		addr2.setState("Guanajuato");
		addr2.setPinCode("00011");
		
		Address officeAddr = new Address();
		officeAddr.setStreet("Paseo de la Reforma");
		officeAddr.setCity("Mexico");
		officeAddr.setState("D.F");
		officeAddr.setPinCode("01223");
				
		UserDetails userDetails = new UserDetails();
		UserDetails userDetails2 = new UserDetails();
		
		userDetails.setUserName("Primer Usuario");
		userDetails.setJoinedDate(new Date());
		userDetails.setDescription("Primer Usuario Descripcion");
		userDetails.getListOfAddresses().add(addr1);
		userDetails.getListOfAddresses().add(officeAddr);
		
		userDetails2.setUserName("Segundo Usuario");
		userDetails2.getListOfAddresses().add(addr2);
		
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
