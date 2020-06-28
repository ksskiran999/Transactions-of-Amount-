package com.durga.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@Column(name="ACCNO")
private String accNo;
@Column(name="BALANCE")

	private int balance;
private String statement;
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getAccNo() {
	return accNo;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public int getBalance() {
	return balance;
}
}
