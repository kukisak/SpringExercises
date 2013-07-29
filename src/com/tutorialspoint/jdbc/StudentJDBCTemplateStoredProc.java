package com.tutorialspoint.jdbc;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplateStoredProc extends StudentJDBCTemplate {

	private SimpleJdbcCall jdbcCall;

	@Override
	public void setDataSource(DataSource ds) {
		super.setDataSource(ds);
		this.jdbcCall = new SimpleJdbcCall(ds).withProcedureName("getRecord");
	}

	@Override
	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}
	
	
	
}
