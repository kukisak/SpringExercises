package com.tutorialspoint.jdbc;

import java.util.List;

import javax.sql.DataSource;

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
	public void create(String name, Integer age) {
		String SQL = "INSERT INTO student (name, age) VALUES (?, ?)";
		
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created record Name = " + name + " Age = " + age);
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL = "SELECT * FROM student WHERE id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "SELECT * FROM student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "DELETE FROM student WHERE id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted record with ID = " + id);
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "UPDATE student SET age = ? WHERE id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated record with ID = " + id);
	}

}
