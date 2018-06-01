package org.bext.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bicicleta")
public class DosRuedas extends Vehicle {
	private String Manubrio;

	public String getManubrio() {
		return Manubrio;
	}

	public void setManubrio(String manubrio) {
		Manubrio = manubrio;
	}
	
	
}
