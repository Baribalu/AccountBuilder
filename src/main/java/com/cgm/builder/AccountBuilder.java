package com.cgm.builder;

import java.util.ArrayList;

import com.cgm.entities.Account;

public class AccountBuilder {

	public static ArrayList<Account> accounts;
	
	public static Account andreiAccount() {
		Account account = new Account();
		account.setUsername("andrei");
		account.setPassword("andrei");
		account.setFullName("Andrei Nicau");
		account.setAge(22);
		account.setFollowers(new ArrayList<String>());
		account.setFollowing(new ArrayList<String>());
		account.setMessages(new ArrayList<String>());
		account.addMessage("Am fost la mare!");
		account.addMessage("Plec la munte!");
		account.addFollower("victor");
		account.addFollowing("bogdan");
		return account;
	}
	
	public static Account bogdanAccount() {
		Account account = new Account();
		account.setUsername("bogdan");
		account.setPassword("bogdan");
		account.setFullName("Bogdan Bogdan");
		account.setAge(22);
		account.setFollowers(new ArrayList<String>());
		account.setFollowing(new ArrayList<String>());
		account.setMessages(new ArrayList<String>());
		account.addMessage("Ma duc la bunici!");
		account.addMessage("Am fost la Bucuresti!");
		return account;
	}
	
	public static Account victorAccount() {
		Account account = new Account();
		account.setUsername("victor");
		account.setPassword("victor");
		account.setFullName("Victor Victor");
		account.setAge(22);
		account.setFollowers(new ArrayList<String>());
		account.setFollowing(new ArrayList<String>());
		account.setMessages(new ArrayList<String>());
		account.addMessage("Calatoresc spre vama!");
		account.addMessage("Ascult muzica!");
		return account;
	}
	
	static {
		accounts=new ArrayList<Account>();
		accounts.add(andreiAccount());
		accounts.add(bogdanAccount());
		accounts.add(victorAccount());
	}
	
}
