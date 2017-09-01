package com.cgm.builder;

import java.util.ArrayList;
import java.util.HashMap;

import com.cgm.entities.Account;
import com.cgm.entities.Message;

public class AccountBuilder {

	public static ArrayList<Account> accounts;
	public static HashMap<String, ArrayList<Message>> messages;
	public static HashMap<String, ArrayList<String>> followers;
	public static HashMap<String, ArrayList<String>> following;

	public static Account andreiAccount() {
		Account account = new Account();
		messages.put("andrei", new ArrayList<Message>());
		followers.put("andrei", new ArrayList<String>());
		following.put("andrei", new ArrayList<String>());
		account.setUsername("andrei");
		account.setPassword("andrei");
		account.setFullName("Andrei Nicau");
		account.setAge(22);
		return account;
	}

	public static Account bogdanAccount() {
		Account account = new Account();
		messages.put("bogdan", new ArrayList<Message>());
		followers.put("bogdan", new ArrayList<String>());
		following.put("bogdan", new ArrayList<String>());
		account.setUsername("bogdan");
		account.setPassword("bogdan");
		account.setFullName("Bogdan Bogdan");
		account.setAge(22);
		return account;
	}

	public static Account victorAccount() {
		Account account = new Account();
		messages.put("victor", new ArrayList<Message>());
		followers.put("victor", new ArrayList<String>());
		following.put("victor", new ArrayList<String>());
		following.get("victor").add("andrei");//HARD
		account.setUsername("victor");
		account.setPassword("victor");
		account.setFullName("Victor Victor");
		account.setAge(22);
		return account;
	}

	static {
		accounts = new ArrayList<Account>();
		messages = new HashMap<String, ArrayList<Message>>();
		followers = new HashMap<String, ArrayList<String>>();
		following = new HashMap<String, ArrayList<String>>();
		accounts.add(andreiAccount());
		accounts.add(bogdanAccount());
		accounts.add(victorAccount());
	}

}
