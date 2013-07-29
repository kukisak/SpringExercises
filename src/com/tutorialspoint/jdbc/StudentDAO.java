package com.tutorialspoint.jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	/**
	 * This is the method to be used to initialize database resources ie. connection
	 * @param ds Resource providing DB connection
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This is the method to be used to create a record in the Student table
	 * @param name Student name
	 * @param age Student age
	 */
	public void create(String name, Integer age);
	
	/**
	 * This is the method to be used to list down a record from the Student table corresponding 
	 * to a passed student id.
	 * @param id Student id
	 * @return Student object
	 */
	public Student getStudent(Integer id);
	
	/**
	 * This is the method to be used to list down all the records from the Student table.
	 * @return List of students
	 */
	public List<Student> listStudents();
	
	/**
	 * This is the method to be used to delete a record from the Student table corresponding to
	 * a passed student id. 
	 * @param id Student id
	 */
	public void delete(Integer id);
	
	/**
	 * This is the method to be used to update a record into the Student table.
	 * @param id Student id
	 * @param age Student age
	 */
	public void update(Integer id, Integer age);
}
