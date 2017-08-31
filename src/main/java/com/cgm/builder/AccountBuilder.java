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
		account.addFollower("Bogdan");
		account.addFollowing("Slash");
		return account;
	}
	
	public static void addAccount(Account account) {
		accounts.add(account);
	}
	
}
