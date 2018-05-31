package org.bext.hibernate;

import org.bext.dto.Address;
import org.bext.dto.CuatroRuedas;
import org.bext.dto.DosRuedas;
import org.bext.dto.UserDetails;
import org.bext.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("transporte");
		DosRuedas bicicleta = new DosRuedas();
		bicicleta.setVehicleName("birula");
		bicicleta.setManubrio("Manubrio de bicicleta");
		CuatroRuedas automovil = new CuatroRuedas();
		automovil.setVehicleName("Audi");
		automovil.setVolante("volante de automovil");
				
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(bicicleta);
		session.save(automovil);
		session.getTransaction().commit();
		session.close();
		
		//sessionFactory.close();
	}

}
