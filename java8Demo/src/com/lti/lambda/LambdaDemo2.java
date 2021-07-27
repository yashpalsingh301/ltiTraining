//package com.lti.lambda;
//
//interface ISum{
//	int sum(int num1,int num2);
//}
//
//public class LambdaDemo2 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		ISum iSum=(int num1,int num2)->{
//			int sum=num1+num2;
//			return sum;
//		};
//		System.out.println(iSum.sum(10, 20));
//
//	}
//
//}



package com.lti.lambda;

@FunctionalInterface
interface ISum<T>{
	T sum(T num1,T num2);
}
interface ISquare{
	void area(double side);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		/*
		 * ISum<Double> iSum=(num1,num2)->{ return num1+num2; };
		 * 
		 * System.out.println("Sum: "+iSum.sum(10,20)); ISquare iSquare=(double
		 * side)->System.out.println("Area of Square :"+(side*side));
		 */
		
		ISum<Integer> sumInterger =(num1,num2)->num1+num2;
		System.out.println("Sum= "+sumInterger.sum(10, 20));
		
		ISum<Double> sumDouble =(num1,num2)->{return num1+num2;};
		System.out.println("Sum= "+sumDouble.sum(12.2, 55.2)); 
	}

}


