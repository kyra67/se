package com.model;

public class User implements java.io.Serializable {
	
	private int id;
	private String num;
	private String password;
	private String name;
	
	public User() {}
	
	public User(String num, String password, String name) {
		this.num = num;
		this.password = password;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
