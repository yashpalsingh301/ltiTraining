package com.lti.polymorphism;

public class IciciAtm implements ATM {
	private double balance=10000;
	private double amount;
	public void withdraw(double amount) {
		System.out.println(amount);

	}
	public double CheckBalance() {
		return (10000-amount);
		
	}

}
