package org.ets.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Definition {
	
	@Id @GeneratedValue
	private int id;
	private String nature;
	private String description;
	public Definition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Definition(int id, String nature, String description) {
		super();
		this.id = id;
		this.nature = nature;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
