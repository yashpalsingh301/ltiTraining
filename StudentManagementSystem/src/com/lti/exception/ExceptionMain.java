package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain {
	
	static int res=0;
	static int[] arr=new int[]{1,2,3,4,5};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println("starts");
		
		System.out.println(divide(n1,n2));
		System.out.println("Enter the pos");
		int pos= sc.nextInt();
		System.out.println(getElement(pos));
				
		
		
		System.out.println("ends");
		

	}
	
	public static int divide(int i, int j){
		try{
			int res=i/j;
		
		} 
		catch(ArithmeticException e){
			System.out.println("cant divide by zero");
		}
		return res;
	}
		
	
	
	public static int getElement(int index){
		return arr[index];
		
	}

}
