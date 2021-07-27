package com.lti.polymorphism;

public class Seller2 extends Amazon {
	public Seller2(){
		super();
	}

	@Override
	void purchase(double price) {
		double totalPrice = price - price*seller2Discount();
		System.out.println(totalPrice);
		// TODO Auto-generated method stub

	}
	
	private double seller2Discount(){
		return 0.02;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
