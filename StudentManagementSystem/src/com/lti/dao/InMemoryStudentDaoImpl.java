package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

import com.lti.model.Course;
import com.lti.model.Student;

public class InMemoryStudentDaoImpl implements Studentdao {

	static List<Student> students = new ArrayList<Student>();

	static Set<Course> courses = new HashSet<Course>();
	static Map<Student, Course> enrollments = new HashMap<>();

	public InMemoryStudentDaoImpl() {
		students.add(new Student(1001, "john", LocalDate.of(2000, 12, 1)));
		students.add(new Student(1002, "mike", LocalDate.of(2000, 12, 1)));
		students.add(new Student(1003, "Klaus", LocalDate.of(2000, 12, 1)));
		students.add(new Student(1004, "Elijah", LocalDate.of(2000, 12, 1)));

		courses.add(new Course(10001, "java", 4, 30000));
		courses.add(new Course(10002, "php", 6, 30040));
		courses.add(new Course(10003, "python", 5, 30500));

	}

	public Course findACourse(int courseId) {
		for (Course course : courses) {
			if (course.getId() == courseId) {
				return course;
			}
		}
		return null;
	}

	public boolean addStudent(Student student) {
		return students.add(student);

	}

	public void updateStudent(Student student) {
		Student exixstingStudent = findAStudent(student.getId());
		if (exixstingStudent != null) {

			int pos = students.indexOf(student);
			students.set(pos, student);
			System.out.println("successful");
		} else {
			System.out.println("student not found");
		}
	}

	public void removeStudent(int id) {
		Student exixstingStudent = findAStudent(id);
		if (exixstingStudent != null) {

			int pos = students.indexOf(exixstingStudent);
			students.set(pos, exixstingStudent);
			System.out.println("student unregistered");
		} else {
			System.out.println("student not found");
		}

	}

	public Student findAStudent(int id) {
		for (Student st : students) {
			if (st.getId() == id) {
				return st;
			}
		}
		return null;

	}

	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void enroll(int studentId, int courseId) {
		Student student=findAStudent(studentId);
		Course course= findACourse(courseId);
		
		if(student==null || course==null){
			System.out.println("either student or course not found");
			
		}
		else{
			enrollments.put(student,course);
			System.out.println("enrolled");
		}
		enrollments.put(student, course);

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		
		return enrollments.entrySet();
	}

}
