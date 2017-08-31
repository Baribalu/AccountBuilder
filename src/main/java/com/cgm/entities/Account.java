package com.cgm.entities;

import java.util.ArrayList;

public class Account {

	private String username;
	private String password;
	private String fullName;
	private int age;
	private ArrayList<String> followers;
	private ArrayList<String> following;
	private ArrayList<String> messages;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public ArrayList<String> getFollowers() {
		return followers;
	}
	public void setFollowers(ArrayList<String> followers) {
		this.followers = followers;
	}
	public ArrayList<String> getFollowing() {
		return following;
	}
	public void setFollowing(ArrayList<String> following) {
		this.following = following;
	}

	public ArrayList<String> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}
	public void addFollower(String user) {
		followers.add(user);
	}
	
	public void addFollowing(String user) {
		following.add(user);
	}
	
	public void removeFollower(String user) {
		followers.remove(user);
	}
	
	public void removeFollowing(String user) {
		following.remove(user);
	}
	
	public void addMessage(String message) {
		messages.add(message);
	}
	
	public void removeMessage(String message) {
		messages.remove(message);
	}
	
}
