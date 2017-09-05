package com.cgm.entities;

import java.io.Serializable;

public class Message implements Serializable {
	
	private String content;
	private String user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Message(String message) {
		this.content = message;
	}
	public Message() {
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
	
}
