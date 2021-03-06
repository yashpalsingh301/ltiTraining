package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public class PersistantStudentDaoImpl implements Studentdao {

	Connection conn;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;
	CallableStatement cstmt;

	public PersistantStudentDaoImpl() {
		conn = ConnectionFactory.getConnection();
	}

	public boolean addStudent(Student student) {
		// sql = "insert into Student1 values(sqll_Student1.nextval,?,?)";
		// try {
		// stmt=conn.prepareStatement(sql);
		// stmt.setString(1, student.getName());
		// stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));//converted
		// java.time.LOcalDate(java8) to java.sql.Date(old)
		// int rec=stmt.executeUpdate();
		// if (rec>0){
		// return true;
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		//
		// return false;
		// }

		sql = "{call insertStudent2(?,?)}";
		
		int reck;
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, student.getName());
			cstmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			reck = cstmt.executeUpdate();
			if (reck > 0) 
				return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

	public void updateStudent(Student student) {
		sql = "update Student1 set name=?, dob=? where id=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, student.getName());
			stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			stmt.setInt(3, student.getId());
			int rec = stmt.executeUpdate();
			if (rec > 0)
				System.out.println("Record updated successfully");
			else
				System.out.println("Sorry no record found");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeStudent(int id) {
		sql = "delete from Student1 where id=? ";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			int rec = stmt.executeUpdate();
			if (rec > 0)
				System.out.println("Record Deleted successfully");
			else
				System.out.println("Sorry no record found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Student findAStudent(int id) {

		sql = "select * from Student1 where id=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				int id1 = rs.getInt(1);
				String names1 = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, names1, dob.toLocalDate());
				return st;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		List<Student> students = new ArrayList<Student>();
		sql = "select * from Student1";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id1 = rs.getInt(1);
				String names1 = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, names1, dob.toLocalDate());
				students.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return students;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
