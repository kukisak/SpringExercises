package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.annotations.Message;
import com.tutorialspoint.annotations.Profile;
import com.tutorialspoint.annotations.ResourcedProfile;
import com.tutorialspoint.annotations.Student;
import com.tutorialspoint.autowiring.TextEditorByConstructor;
import com.tutorialspoint.autowiring.TextEditorByName;
import com.tutorialspoint.autowiring.TextEditorByType;
import com.tutorialspoint.di.TextEditor;
import com.tutorialspoint.injectcollections.JavaCollection;
import com.tutorialspoint.javabasedconfig.AppConfig;
import com.tutorialspoint.javabasedconfig.HelloJava;
import com.tutorialspoint.javabasedconfig.HelloJavaConfig;
import com.tutorialspoint.javabasedconfig.TextEditorConfig;

public class MainApp {

	public static void main(String[] args) 
	{
		MainApp app = new MainApp();
//		app.testDestroyMethods();
//		app.testSingletonAndPrototype();
//		app.testBeanDefinitionInheritance();
//		app.testDependencyInjection();
//		app.testJavaCollections();
//		app.testJavaCollectionsRefs();
//		app.testAutowireByName();
//		app.testAutowireByType();
//		app.testAutowireByConstructor();
//		app.testRequiredAnnotation();
//		app.testAutowiredSetterAnnotation();
//		app.testAutowiredPropertyAnnotation();
//		app.testAutowiredConstructorAnnotation();
//		app.testQualifierAnnotation();
//		app.testPostConstructPreDestroyAnnotations();
//		app.testResourceAnnotation();
		
//		app.testJavaBasedConfig();
//		app.testJavaBasedConfigRegister();
//		app.testJavaBasedConfigInjection();
		app.testJavaBasedConfigImport();
	}
	
	public void testBeanDefinitionInheritance()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMessage();
		obj1.getMessage1();
		
		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
		obj2.getMessage();
		obj2.getMessage1();
		obj2.getMessage2();
	
		HelloFromTemplate helloFromTempalte = (HelloFromTemplate) context.getBean("helloFromTemplate");
		helloFromTempalte.getMessage();
		helloFromTempalte.getMessage1();
		helloFromTempalte.getMessage2();
		
		obj1 = null;
		obj2 = null;
		helloFromTempalte = null;
	}
	
	public void testDestroyMethods()
	{
		// AbstractApplicationContext allows call beans destroy methods via registerShutdownHook
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("different message");
		
		HelloWorld newObj = (HelloWorld) context.getBean("helloWorld");
		newObj.getMessage();
		
		SecondHelloWorld obj2 = (SecondHelloWorld) context.getBean("secondHelloWorld");
		obj2.getMessage();
		obj2.setMessage("different Hello2");
		
		SecondHelloWorld newObj2 = (SecondHelloWorld) context.getBean("secondHelloWorld");
		newObj2.getMessage();
		
		obj = null;
		obj2 = null;
		newObj = null;
		newObj2 = null;
		// Register destroy methods for each Bean when applicable.
		// Destroy methods are called for Beans in Singleton scope. Such methods are not called for Prototype scope (don't know why).
		context.registerShutdownHook();
	}
	
	public void testSingletonAndPrototype()
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("different message");
		
		HelloWorld newObj = (HelloWorld) context.getBean("helloWorld");
		newObj.getMessage();
		
		SecondHelloWorld obj2 = (SecondHelloWorld) context.getBean("secondHelloWorld");
		obj2.getMessage();
		obj2.setMessage("different Hello2");
		
		SecondHelloWorld newObj2 = (SecondHelloWorld) context.getBean("secondHelloWorld");
		newObj2.getMessage();
		
		obj = null;
		obj2 = null;
		newObj = null;
	}
	
	public void testDependencyInjection()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
	
	public void testJavaCollections()
	{
		ApplicationContext contex = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection jc = (JavaCollection) contex.getBean("javaCollection");
		
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProps();
	}
	
	public void testJavaCollectionsRefs()
	{
		ApplicationContext contex = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection jc = (JavaCollection) contex.getBean("javaCollectionRefs");
		
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
//		jc.getAddressProps();
	}
	
	public void testAutowireByName()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorByName teaw = (TextEditorByName) context.getBean("textEditorByName");
		
		teaw.spellCheck();
	}
	
	public void testAutowireByType()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorByType teaw = (TextEditorByType) context.getBean("textEditorByType");
		
		teaw.spellCheck();
	}
	
	public void testAutowireByConstructor()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorByConstructor teaw = (TextEditorByConstructor) context.getBean("textEditorByConstructor");
		
		teaw.spellCheck();
	}
	
	public void testRequiredAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		Student student = (Student) context.getBean("student");
		
		System.out.println("Student age: " + student.getAge());
		System.out.println("Student name: " + student.getName());
	}
	
	public void testAutowiredSetterAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		com.tutorialspoint.annotations.TextEditor te = 
				(com.tutorialspoint.annotations.TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
	
	public void testAutowiredPropertyAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		com.tutorialspoint.annotations.TextEditor te = 
				(com.tutorialspoint.annotations.TextEditor) context.getBean("textEditor");
		te.enhSpellCheck();
	}
	
	public void testAutowiredConstructorAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		com.tutorialspoint.annotations.TextEditor te = 
				(com.tutorialspoint.annotations.TextEditor) context.getBean("textEditor");
		te.constEnhSpellCheck();
	}
	
	public void testQualifierAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		Profile pr = (Profile) context.getBean("profile");
		pr.pringName();
		pr.pringAge();
	}
	
	public void testPostConstructPreDestroyAnnotations()
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		Message msg = (Message) context.getBean("message");
		msg.getMessage();
		context.registerShutdownHook();
	}
	
	public void testResourceAnnotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfig.xml");
		ResourcedProfile pr = (ResourcedProfile) context.getBean("resourcedProfile");
		pr.pringName();
		pr.pringAge();
	}
	
	public void testJavaBasedConfig()
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloJavaConfig.class);
		
		HelloJava helloJava = ctx.getBean(HelloJava.class);
		
		helloJava.setMessage("Hello Java master");
		helloJava.getMessage();
	}
	
	public void testJavaBasedConfigRegister()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(HelloJavaConfig.class);
		ctx.refresh();
		
		HelloJava helloJava = ctx.getBean(HelloJava.class);
		helloJava.setMessage("Hello Java dude");
		helloJava.getMessage();
	}
	
	public void testJavaBasedConfigInjection()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TextEditorConfig.class);
		ctx.refresh();
		
		com.tutorialspoint.javabasedconfig.TextEditor te =
				(com.tutorialspoint.javabasedconfig.TextEditor) ctx.getBean(
						com.tutorialspoint.javabasedconfig.TextEditor.class);
		te.spellCheck();
	}
	
	public void testJavaBasedConfigImport()
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		HelloJava hello = (HelloJava) ctx.getBean(HelloJava.class);
		hello.setMessage("Java based config import");
		hello.getMessage();
		
		com.tutorialspoint.javabasedconfig.TextEditor te =
				(com.tutorialspoint.javabasedconfig.TextEditor) ctx.getBean(
						com.tutorialspoint.javabasedconfig.TextEditor.class);
		te.spellCheck();
		ctx.registerShutdownHook();
	}

}
