package com.lti.polymorphism;

public class Seller1 extends Amazon {
	public Seller1(){
		super();
	}

	@Override
	void purchase(double price) {
		double totalPrice = price - price*amazonDiscount();
		System.out.println(totalPrice);
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
