package com.tutorialspoint.annotations;

public class EnhancedSpellChecker extends SpellChecker {

	@Override
	public void checkSpelling() 
	{
		System.out.println("Inside Enhanced spell checking");
	}

	public EnhancedSpellChecker() 
	{
		super();
		System.out.println("Inside Enhanced SpellChecker");
	}

	
}
