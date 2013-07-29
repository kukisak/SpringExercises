package com.tutorialspoint.transactions;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainApp app = new MainApp();
		app.doStudentMarksStaff();

	}


	public void doStudentMarksStaff()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/tutorialspoint/transactions/BeansTransactions.xml");
		StudentDAO studentJdbcTemplate = (StudentDAO) ctx.getBean("studentJDBCTemplate");
		
		System.out.println("----Records creation----");
		studentJdbcTemplate.create("Zara", 23, 85, 2011);
		studentJdbcTemplate.create("Nuha", 22, 90, 2010);
		studentJdbcTemplate.create("Ayan", 20, 95, 2013);
		
		System.out.println("----Listing multiple records----");
		List<StudentMarks> students = studentJdbcTemplate.listStudents();
		for (StudentMarks student : students) {
			System.out.print("Id: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
			System.out.println(", marks: " + student.getMarks() + ", year: " + student.getYear());
		}
		
	}
}
