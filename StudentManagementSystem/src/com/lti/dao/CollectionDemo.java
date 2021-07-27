package com.lti.dao;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<Student> students= new ArrayList<Student>();
//		
//		students.add(new Student(1,"mike",LocalDate.of(2000,04,12)));
//		students.add(new Student(1,"john",LocalDate.of(2001,03,12)));
//		students.add(new Student(1,"cena",LocalDate.of(2002,05,16)));
//		students.add(new Student(1,"randy",LocalDate.of(2003,07,14)));
//		students.add(new Student(1,"orton",LocalDate.of(2004,04,12)));
//		
//
//		Student st= (new Student(1,"orton",LocalDate.of(2004,04,12)));
//		System.out.println(students.indexOf(st));
//		
//		List<Integer> nums= new ArrayList<Integer>();
//		nums.add(60);
//		nums.add(50);
//		nums.add(40);
//		nums.add(30);
//		nums.add(20);
//		
//		System.out.println(nums.indexOf(60));

		Set<String>  names=new TreeSet<String>();
		names.add(new String("yash"));
		names.add(new String("prashant"));
		names.add(new String("utsav"));
		names.add(new String("naro"));
//		names.add(null);
		names.remove("yash");
		System.out.println(names);
		names.add("yash");
		
//		System.out.println(names.contains("yash"));
//		System.out.println(names);
		
		
		
		//Map interface
		Map<Integer, String> credentials= new HashMap<Integer,String>();
		credentials.put(1001, "karan");
		credentials.put(1002, "singh");
		credentials.put(10033, "utsav");
		credentials.put(1004, "prashant");
		credentials.put(1009, null);
		credentials.put(10011, null);
		credentials.put(null, "sdfgh");
		credentials.put(null, "sdfgh");
		
//		System.out.println(credentials);

	



Map<Integer, String> credentialss= new TreeMap<Integer,String>();
credentialss.put(1001, "karan");
credentialss.put(1002, "singh");
credentialss.put(1003, "utsav");
credentialss.put(1004, "prashant");
//credentialss.put(1009, null);
//credentialss.put(10011, null);
//credentialss.put(null, "sdfgh");
//credentialss.put(null, "sdfgh");

System.out.println(credentialss);


Set<Entry<Integer,String>>entrySet=credentialss.entrySet();
Iterator<Entry<Integer,String>>iterator=entrySet.iterator();
while(iterator.hasNext()){
	Entry<Integer,String> items=iterator.next();
	System.out.println(items.getKey()+ items.getValue());
}
Iterator <String> allNames=names.iterator();
while(allNames.hasNext()){
	String name=allNames.next();
	System.out.println(name);
}

}
}


