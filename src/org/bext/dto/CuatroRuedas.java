package org.bext.dto;

import javax.persistence.Entity;

@Entity
public class CuatroRuedas extends Vehicle {
	private String volante;

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}
	
	
}
