package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.DegreeCourse;
import com.lti.model.DegreeLevel;
import com.lti.model.DiplomaCourse;
import com.lti.model.DiplomaLevel;
import com.lti.model.Student;

public class App {

	public static void main(String[] args) {
		scenario9();

	}

	 public static void scenario1() {
	 String[] student1phoneNumber = { "123456" };
	 Student student = new Student();
	 Student student1 = new Student(101, "john", LocalDate.now(),
	 student1phoneNumber);
	 Student student2 = new Student(101, "kt", LocalDate.now(),
	 student1phoneNumber);
	
	 Info info = new Info();
	 info.displays(student);
	 info.displays(student1);
	 info.displays(student2);
	
	 }
	
	 public static void scenario2() {
	 Student[] students = new Student[3];
	 String[] student1phoneNumber = { "123456" };
	 String[] student2phoneNumber = { "12789556" };
	 String[] student3phoneNumber = { "15452856" };
	
	 students[1] = new Student(101, "john", LocalDate.now(),
	 student1phoneNumber);
	 students[0] = new Student(101, "cena", LocalDate.now(),
	 student2phoneNumber);
	 students[2] = new Student(101, "randy", LocalDate.now(),
	 student3phoneNumber);
	
	 Info info = new Info();
	 info.displays(students);
	 }
	
	 public static void scenario3() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter number");
	 int a = sc.nextInt();
	 Student[] students = new Student[a];
	 for (int i = 0; i < students.length; i++) {
	 System.out.println("enter details");
	 int id = sc.nextInt();
	 String name = sc.next();
	 String date = sc.next();
	 DateTimeFormatter formatter = DateTimeFormatter
	 .ofPattern("dd/MM/yyyy");
	 LocalDate dateOfBirth = LocalDate.parse(date, formatter);
	 students[i] = new Student(id, name, dateOfBirth);
	
	 }
	 Info info = new Info();
	 info.displays(students);
	 }
	
	 public static void scenario4() {
	 List<Student> students = new ArrayList<Student>();
	 Scanner sc = new Scanner(System.in);
	 do {
	 System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
	 int id = sc.nextInt();
	 String name = sc.next();
	 String date = sc.next();
	 DateTimeFormatter formatter = DateTimeFormatter
	 .ofPattern("dd/MM/yyyy");
	 LocalDate dateOfBirth = LocalDate.parse(date, formatter);
	
	 students.add(new Student(id, name, dateOfBirth));
	
	 System.out.println("Press 0 to sstop");
	 int num = sc.nextInt();
	 if (num == 0)
	 break;
	 } while (true);
	 Info.displays(students);
	 }

//	public static void scenario5() {
//
//		Course course1 = new Course(101, "john", 6, 2000);
//
//		Course course2 = new Course(101, "kt", 2, 3000);
//
//		Info info = new Info();
//
//		info.display(course1);
//		info.display(course2);
//
//	}
//
//	public static void scenario6() {
//		Course[] courses = new Course[2];
//
//		courses[1] = new Course(101, "john", 5, 3000);
//
//		courses[2] = new Course(101, "randy", 3, 6000);
//
//		Info info = new Info();
//		info.display(courses);
//	}
//
//	public static void scenario7() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number");
//		int a = sc.nextInt();
//		Course[] courses = new Course[a];
//		for (int i = 0; i < courses.length; i++) {
//			System.out.println("enter details");
//			int id = sc.nextInt();
//			String name = sc.next();
//			int durationn = sc.nextInt();
//			int feess = sc.nextInt();
//			courses[i] = new Course(id, name, durationn, feess);
//
//		}
//		Info info = new Info();
//		info.display(courses);
//	}
//
//	public static void scenario8() {
//		List<Course> courses = new ArrayList<Course>();
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Enter your id,name,dur,fees");
//			int id = sc.nextInt();
//			String name = sc.next();
//			int durationn = sc.nextInt();
//			int feess = sc.nextInt();
//
//			courses.add(new Course(id, name, durationn, feess));
//
//			System.out.println("Press 0 to sstop");
//			int num = sc.nextInt();
//			if (num == 0)
//				break;
//		} while (true);
//		Info.display(courses);
//	}

	 public static void scenario9(){
		 DegreeCourse degreeCourse= new DegreeCourse(101,"btech",96,5222,DegreeLevel.bachelors,true);
		 Info.displayCourse(degreeCourse);
		 
		 DiplomaCourse diplomaCourse= new DiplomaCourse(101,"btech",96,5222,DiplomaLevel.Professional,true);
		 Info.displayCourse(diplomaCourse);
	 }
	 
}
