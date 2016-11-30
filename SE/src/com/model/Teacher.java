package com.model;

public class Teacher implements java.io.Serializable {
	
	private int id;
	private String name;
	private String sex;
	private String degree;
	private String position;
	private String eduBackground;
	private String college;
	private String address;
	private String direction;
	private String intro;
	private String achievement;
	private String photo;
	
	public Teacher() {}
	
	public Teacher(String name, String sex, String degree, String position, String eduBackground, 
			String college, String address, String direction, String intro, String achievement, String photo) {
		this.name = name;
		this.sex = sex;
		this.degree = degree;
		this.position = position;
		this.eduBackground = eduBackground;
		this.college = college;
		this.address = address;
		this.direction = direction;
		this.intro = intro;
		this.achievement = achievement;
		this.photo = photo;
	}
	
	public int setId() {
		return id;
	}
	
	public void getId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPostion(String position) {
		this.position = position;
	}
	
	public String getEduBackground() {
		return eduBackground;
	}
	
	public void setEduBackground(String eduBackground) {
		this.eduBackground = eduBackground;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String addredd) {
		this.address = address;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String getIntro() {
		return intro;
	}
	
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	public String setAchievement() {
		return achievement;
	}
	
	public void getAchievement(String achievement) {
		this.achievement = achievement;
	}
	
	public String setPhoto() {
		return photo;
	}
	
	public void getPhoto(String photo) {
		this.photo = photo;
	}

}
