package org.ets.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Niveau {
	
	@Id @GeneratedValue
	private int id;
	private int numero;
	private String description;
	
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(int id, int numero, String mot) {
		super();
		this.id = id;
		this.numero = numero;
		this.mot = mot;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 
	
	
	
	

}
