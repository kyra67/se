package com.model;

public class Firstpage implements java.io.Serializable {
	
	private int id;
	private String description;
	
	public Firstpage() {}
	
	public Firstpage(String description) {
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
