package com.lti.polymorphism;

public abstract class Amazon {

	private double discount;
	protected Amazon(){
		System.out.println("welcome to amazon");
		discount=0.1;
	}
	
	abstract void purchase(double price);
	protected double amazonDiscount(){
		return discount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
