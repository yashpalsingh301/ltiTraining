package com.lti.polymorphism;

import java.util.Scanner;

public class AbstractMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Amazon amazon= null;
		System.out.println("1.Seller1 2 Seller2");
		Scanner sc = new Scanner(System.in);
		int val=sc.nextInt();
		
		if(val==1){
			amazon=new Seller1();
		}
		
		if(val==2){
			amazon= new Seller2();
		}
		amazon.purchase(5000);
	}

}
