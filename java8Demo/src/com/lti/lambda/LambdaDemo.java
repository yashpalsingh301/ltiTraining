package com.lti.lambda;

import java.util.Scanner;

//interface AddCalc {
//	void sum(int i, int y);
//}

interface Shape {
	void area();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
	
	Shape Rect =() ->{
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("area= "+ (x*y));
	};
	
	}
}
