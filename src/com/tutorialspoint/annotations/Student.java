package com.tutorialspoint.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	private String year;
	
	public String getYear() {
		return year;
	}
	
	@Autowired(required=false) // @Autowired(required=false) disabled default required behavior of Autowired annotation
	public void setYear(String year) {
		this.year = year;
	}
	
	public Integer getAge() {
		return age;
	}
	
	@Required // @Required annotation demand propery age do be defined in bean
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	

}
