package com.lti.main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.lti.dao.InMemoryStudentDaoImpl;
import com.lti.dao.PersistantStudentDaoImpl;
import com.lti.dao.Studentdao;
import com.lti.model.Course;
import com.lti.model.Student;

public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Studentdao studentdao = new InMemoryStudentDaoImpl() ;
        Studentdao studentdao= new PersistantStudentDaoImpl();
        
//			public List<Student> viewAllStudents() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			public void updateStudent(Student student) {
//				// TODO Auto-generated method stub
//
//			}
//
//			
//				// TODO Auto-generated method stub
//
//			}
//
//			public Student findAStudent(int id) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			public boolean addStudent(Student student) {
//				// TODO Auto-generated method stub
//				return true;
//			}
//        };
	
		boolean flagg = true;
		do {
			System.out
					.println("1.Add a student \n2.update a student \n3.Remove a Student \n4.search a student \n5.view all student \n6.Enroll \n7.View All");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			int id;
			String name;
			String date;
			DateTimeFormatter formatter;
			LocalDate dateOfBirth;
			Student student;

			switch (ch) {
		
			

			case 1:
				System.out
						.println("Enter your name,date of birth(dd/MM/yyyy)");
//				 id = sc.nextInt();
				 name = sc.next();
			     date = sc.next();
		         formatter = DateTimeFormatter
						.ofPattern("dd/MM/yyyy");
				 dateOfBirth = LocalDate.parse(date, formatter);

//				 student = new Student(id, name, dateOfBirth);
				 student=new Student();
				 student.setName(name);
				 student.setDateOfBirth(dateOfBirth);
				 
				boolean result = studentdao.addStudent(student);
				if (result) {
					System.out.println("cong");
				} else {
					System.out.println("sorry");
				}

				break;

			case 2:
				System.out
						.println("Enter your id,name,date of birth(dd/MM/yyyy)");
				id = sc.nextInt();
				name = sc.next();
				date = sc.next();
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dateOfBirth = LocalDate.parse(date, formatter);
				
				student = new Student(id,name,dateOfBirth);
				studentdao.updateStudent(student);
				break;

			case 3:
				System.out.println("enter the id");
				id = sc.nextInt();
				studentdao.removeStudent(id);
				
				break;

			case 4:
				System.out.println("enter the id");
				id = sc.nextInt();
				student=studentdao.findAStudent(id);
				if(student!=null){
				System.out.println(student.getId()+" "+ student.getName()+" "+ student.getDateOfBirth());}
				else{
					System.out.println("not found");
				}
				
				break;

			case 5:

				List<Student> students = studentdao.viewAllStudents();
				for (Student st : students) {
					System.out.println(st.getId() +" " + st.getName()
							+" "+ st.getDateOfBirth());
				}
				break;
				
			case 6:
				System.out.println("enterr id and course");
				int studentId=sc.nextInt();
				int courseId=sc.nextInt();
				studentdao.enroll(studentId,  courseId);
				break;
			case 7:
				Set<Entry<Student,Course>>enrollments=studentdao.viewEnrollments();
                Iterator<Entry<Student,Course>>allEnrollments=enrollments.iterator();
                while(allEnrollments.hasNext()){
                	Entry<Student, Course>enrollment=allEnrollments.next();
                	Student st=enrollment.getKey();
                	Course cs=enrollment.getValue();
                	System.out.println(st.getId()+ st.getName()+ st.getDateOfBirth());
                }
			default:
				flagg = false;
				break;
			}

		} while (flagg);

	}
}
