package com.tutorialspoint.autowiring;

public class TextEditorByType {

	private SpellChecker spellCheckerByConstructor;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public SpellChecker getSpellCheckerByConstructor() 
	{
		return spellCheckerByConstructor;
	}

	public void setSpellCheckerByConstructor(
			SpellChecker spellCheckerByConstructor) 
	{
		System.out.println("Inside setSpellCheckerByConstructor");
		this.spellCheckerByConstructor = spellCheckerByConstructor;
	}

	public void spellCheck()
	{
		this.spellCheckerByConstructor.checkSpelling();
	}
}
