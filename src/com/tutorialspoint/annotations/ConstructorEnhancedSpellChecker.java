package com.tutorialspoint.annotations;

public class ConstructorEnhancedSpellChecker extends SpellChecker {

	@Override
	public void checkSpelling() 
	{
		System.out.println("Inside Constructor Enhanced spell checking");
	}

	public ConstructorEnhancedSpellChecker() 
	{
		super();
		System.out.println("Inside Constructor Enhanced SpellChecker");
	}

	
}
