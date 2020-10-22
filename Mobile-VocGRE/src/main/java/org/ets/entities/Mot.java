package org.ets.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mot implements Serializable{
	@Id @GeneratedValue
	private int id;
	private String mot;
	 
	public Mot() {
		super();
	}
	public Mot(String mot) {
		super();
		this.mot = mot;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
 
 
}
