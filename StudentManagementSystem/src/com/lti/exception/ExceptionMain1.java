package com.lti.exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	
	 
	public static void main(String[] args){ //throws IOException {
		// TODO Auto-generated method stub
		fileRead("d:\\copytest.txt");

	}
private static void fileRead(String string) {
		// TODO Auto-generated method stub
		
	}
public static void filename(String filename) throws IOException{
	FileReader reader = null;
	try {
		reader = new FileReader(filename);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	char[] ch = new char[100];
	reader.read(ch);
	System.out.println(ch);
	
}
}
