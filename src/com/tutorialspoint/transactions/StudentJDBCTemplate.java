package com.tutorialspoint.transactions;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		
		
		try {
			String SQL = "INSERT INTO student (name, age) VALUES (?, ?)";
			
			jdbcTemplateObject.update(SQL, name, age);
			
			// Get the latest student id to be used in Marks table
			String SQL2 = "SELECT max(ID) FROM student";
			int sid = jdbcTemplateObject.queryForInt(SQL2);
			
			String SQL3 = "INSERT INTO marks (sid, marks, year) VALUES (?, ?, ?)";
			jdbcTemplateObject.update(SQL3, sid, marks, year);
			System.out.println("Created record Name = " + name + " Age = " + age);
			throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back!");
			throw e;
		}
	}
	
	@Override
	public List<StudentMarks> listStudents() {
		String SQL = "SELECT * FROM student, marks where student.id = marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}

}
