package com.tutorialspoint.aspects.aspectjbased;


public class Student {

	private String name;
	private Integer age;
	
	public String getName() {
		System.out.println("Name: " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		System.out.println("Age: " + age);
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void throwException()
	{
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
