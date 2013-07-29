package com.tutorialspoint.annotations;

import javax.annotation.Resource;

public class ResourcedProfile 
{
	@Resource(name="student2")
	private Student student;

	public ResourcedProfile() 
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
