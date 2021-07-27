package com.lti.polymorphism;

public class SbiAtm implements ATM {
	private double balance=10000;
	private double amount;
	public void withdraw(double amount) {
		this.amount=amount;
		System.out.println(amount);

	}


	public double CheckBalance() {
		return balance-amount;
		
	}

}
