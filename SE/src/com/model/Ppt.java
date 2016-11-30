package com.model;

public class Ppt implements java.io.Serializable {
	
	private int id;
	private String path;
	private String name;
	private String date;
	
	public Ppt() {}
	
	public Ppt(String path, String name, String date) {
		this.name = name;
		this.path = path;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

}
