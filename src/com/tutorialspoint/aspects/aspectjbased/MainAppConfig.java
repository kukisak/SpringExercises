package com.tutorialspoint.aspects.aspectjbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MainAppConfig {

	@Bean
	public Student student()
	{
		Student st = new Student();
		st.setAge(22);
		st.setName("Hana");
		return st;
	}
	
	@Bean
	public Logging logging()
	{
		return new Logging();
	}
}
