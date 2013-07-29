package com.tutorialspoint.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student1")
	private Student student;

	public Profile() 
	{
		System.out.println("Inside Profile constructor");
	}
	
	public void pringAge()
	{
		System.out.println("Student age: " + this.student.getAge());
	}
	
	public void pringName()
	{
		System.out.println("Student name: " + this.student.getName());
	}
	
	
}
