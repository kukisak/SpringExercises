package com.tutorialspoint.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainApp app = new MainApp();
//		app.testAspectsSchemaBased();
		app.testAspectsAspecjBased_JavaConfig();
//		app.testAspectsAspecjBased_XMLConfig();
	}
	
	public void testAspectsSchemaBased()
	{
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/com/tutorialspoint/aspects/schemabased/Beans.xml");
		
		com.tutorialspoint.aspects.schemabased.Student student = 
				(com.tutorialspoint.aspects.schemabased.Student) 
				ctx.getBean(com.tutorialspoint.aspects.schemabased.Student.class);
		student.getAge();
		student.getName();
		student.throwException();
	}
	
	public void testAspectsAspecjBased_JavaConfig()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(com.tutorialspoint.aspects.aspectjbased.MainAppConfig.class);
//		ctx.getEnvironment().setActiveProfiles("dev");
//		ctx.scan("com.tutorialspoint.aspects.aspectjbased");
		ctx.refresh();
		
		com.tutorialspoint.aspects.aspectjbased.Student student = 
				(com.tutorialspoint.aspects.aspectjbased.Student) 
				ctx.getBean(com.tutorialspoint.aspects.aspectjbased.Student.class);
		student.getAge();
		student.getName();
		student.throwException();
	}
	
	public void testAspectsAspecjBased_XMLConfig()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/com/tutorialspoint/aspects/aspectjbased/Beans.xml");
		
		com.tutorialspoint.aspects.aspectjbased.Student student = 
				(com.tutorialspoint.aspects.aspectjbased.Student) 
				ctx.getBean(com.tutorialspoint.aspects.aspectjbased.Student.class);
		student.getAge();
		student.getName();
		student.throwException();
	}

}
