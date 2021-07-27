package com.lti.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6};
		int [] num1 = {10,23,4,5,6};
		try {
			System.out.println(num[0]);
			System.out.println(num1[2]);
			System.out.println(10/0);
			
		} catch (NullPointerException e) {
			System.out.println("array is null");
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("index issue");
		}
		
		catch (Exception e){
			System.out.println("exception bada hai");
		}
		

		catch (Throwable e){
			System.out.println("throwable sabse bada hai");
	}
	}

}
