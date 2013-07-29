package com.tutorialspoint.javabasedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HelloJavaConfig.class, TextEditorConfig.class})
public class AppConfig {

	
}
