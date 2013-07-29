package com.tutorialspoint.transactions;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	/**
	 * This is the method to be used to initialize database resources ie. connection
	 * @param ds Resource providing DB connection
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This is the method to be used to create a record in the Student and Marks table
	 * @param name Student name
	 * @param age Student age
	 * @param marks Student marks
	 * @param year Student year
	 */
	public void create(String name, Integer age, Integer marks, Integer year);
	
	/**
	 * This is the method to be used to list down all the records from the Student and Marks table.
	 * @return List of student marks
	 */
	public List<StudentMarks> listStudents();
}
