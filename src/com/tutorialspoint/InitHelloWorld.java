package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor
{
	// Such class methods which implements BeanPostProcessor interface are called automatically during beans initialization phase.
	// Spring IoC (Inverse of Control) container detect such type of classes and call those methods for each instantiated bean. 

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException 
	{
		System.out.println("After initialization: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException 
	{
		System.out.println("Before initialization: " + beanName);
		return bean;
	}

}
