package com.lti.polymorphism;

import java.util.Scanner;

public class InterfaceMain {
	public static void main(String[] args){
		System.out.println("1.ICICI \n2.SBI");
		int ch= new Scanner(System.in).nextInt();
		
		ATM atm=null;
		if (ch==1){
			atm=new IciciAtm();
		}
		
		if(ch==2){
			atm= new SbiAtm();
		}
		System.out.println(atm.CheckBalance());
		atm.withdraw(10000);
		
			
	}

}
