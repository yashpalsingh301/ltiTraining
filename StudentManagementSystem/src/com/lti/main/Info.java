package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.Student;



public class Info {
//
	public static void displays(Student student) {
		System.out.println(student.getId() + " " + student.getName() + " "
				+ student.getDateOfBirth() + " " + Student.getCollege() + " "
				+ Arrays.toString(student.getPhoneNumber()));
	}

	public void displays(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			displays(students[i]);
		}
	}

	public static void displays(List<Student> students) {
		Iterator<Student> studs = students.iterator();
		while (studs.hasNext()) {
			Student st = studs.next();
			displays(st);
		}

	}


 public static void displayCourse(Course course){
	 course.MonthlyFees();
 }


//	public static void display(Course course) {
//		System.out.println(course.getId() + " " + course.getName() + " "
//				+ course.getDuration() + " " + course.getFees() );
//	}
//
//	public void display(Course[] courses) {
//		for (int i = 0; i < courses.length; i++) {
//			display(courses[i]);
//		}
//	}
//
//	public static void display(List<Course> courses) {
//		Iterator<Course> cur = courses.iterator();
//		while (cur.hasNext()) {
//			Course st = cur.next();
//			display(st);
//		}
//
//	}
}
