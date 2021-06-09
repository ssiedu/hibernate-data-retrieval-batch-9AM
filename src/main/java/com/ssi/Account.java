package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	private int ano;
	private String name;
	private int balance;
	private String type;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", name=" + name + ", balance=" + balance + ", type=" + type + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Account(int ano, String name, int balance, String type) {
		super();
		this.ano = ano;
		this.name = name;
		this.balance = balance;
		this.type = type;
	}
	public Account() {
		super();
	}
	
	
}
