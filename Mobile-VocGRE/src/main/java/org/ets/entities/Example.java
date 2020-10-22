package org.ets.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Example {
	
	@Id @GeneratedValue
	private int id;
	private String description;
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Example(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
