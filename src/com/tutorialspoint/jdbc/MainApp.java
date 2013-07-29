package com.tutorialspoint.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainApp app = new MainApp();
//		app.doStudentStaff();
		app.doStudentStaffStoredProc();

	}

	public void doStudentStaff()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/tutorialspoint/jdbc/Beans.xml");
		StudentJDBCTemplate studentJdbcTemplate = (StudentJDBCTemplate) ctx.getBean("studentJDBCTemplate");
		
		System.out.println("----Records creation----");
		studentJdbcTemplate.create("Zara", 23);
		studentJdbcTemplate.create("Nuha", 22);
		studentJdbcTemplate.create("Ayan", 20);
		
		System.out.println("----Listing multiple records----");
		List<Student> students = studentJdbcTemplate.listStudents();
		for (Student student : students) {
			System.out.println("Id: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
		}
		
		System.out.println("----Updating records with id = 2----");
		studentJdbcTemplate.update(5, 25);
		
		System.out.println("----Listing record with id = 2----");
		Student student = studentJdbcTemplate.getStudent(2);
		System.out.println("Id: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
		
	}
	public void doStudentStaffStoredProc()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/tutorialspoint/jdbc/BeansJdbc.xml");
		StudentJDBCTemplateStoredProc studentJdbcTemplate = (StudentJDBCTemplateStoredProc)
				ctx.getBean("studentJDBCTemplateStoredProc");
		
		System.out.println("----Records creation----");
		studentJdbcTemplate.create("Zara", 23);
		studentJdbcTemplate.create("Nuha", 22);
		studentJdbcTemplate.create("Ayan", 20);
		
		System.out.println("----Listing multiple records----");
		List<Student> students = studentJdbcTemplate.listStudents();
		for (Student student : students) {
			System.out.println("Id: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
		}
		
		System.out.println("----Updating records with id = 2----");
		studentJdbcTemplate.update(2, 25);
		
		System.out.println("----Listing record with id = 2----");
		Student student = studentJdbcTemplate.getStudent(2);
		System.out.println("Id: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
		
	}
}
