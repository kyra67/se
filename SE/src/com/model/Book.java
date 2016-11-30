package com.model;

public class Book implements java.io.Serializable {
	
	private int id;
	private String name;
	private String path;
	private String description;
	
	public Book() {}
	
	public Book(String name, String path, String description) {
		this.name = name;
		this.path = path;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
