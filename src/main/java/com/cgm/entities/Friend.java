package com.cgm.entities;

import java.io.Serializable;

public class Friend implements Serializable {

	private String username;
	private String fullName;
	private int age;
	private boolean isFriend;

	public Friend() {

	}

	public Friend(String username, String fullName, int age, boolean isFriend) {
		this.username = username;
		this.fullName = fullName;
		this.age = age;
		this.isFriend = isFriend;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getIsFriend() {
		return isFriend;
	}

	public void setIsFriend(boolean isFriend) {
		this.isFriend = isFriend;
	}
	
}
