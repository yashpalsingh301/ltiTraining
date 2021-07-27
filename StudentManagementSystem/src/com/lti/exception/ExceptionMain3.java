package com.lti.exception;

import java.util.Scanner;
import com.lti.exception.NegativeAgeException;

public class ExceptionMain3 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6};
		int [] num1 =  {10,23,4,5,6};
		try {
			System.out.println(num[0]);
			System.out.println(num1[9]);
			System.out.println(10/0);
			
		} catch (NullPointerException e) {
			System.out.println( e.getMessage());
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		finally{
			System.out.println("finally executed");
	}
		
		int age=0;
		Scanner sc= new Scanner(System.in);
		age=sc.nextInt();
		if (age<0){
			try {
			throw new NegativeAgeException("Invalid age");
			}
			catch(NegativeAgeException e){
				System.out.println(e.getMessage());
			}
				
			
		}
		else{
				System.out.println("your age is:" +age);
			}
			
		}
	}


