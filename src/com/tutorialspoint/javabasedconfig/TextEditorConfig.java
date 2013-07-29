package com.tutorialspoint.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor()
	{
		return new TextEditor(spellChecker());
	}
	
	@Bean(initMethod = "init", destroyMethod = "cleanup")
	@Scope("prototype")
	public SpellChecker spellChecker()
	{
		return new SpellChecker();
	}
}
