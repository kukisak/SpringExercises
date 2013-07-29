package com.tutorialspoint.autowiring;

public class TextEditorByConstructor {

	private SpellChecker spellCheckerByConstructor;
	
	private String name;

	
	public TextEditorByConstructor(
			SpellChecker spellCheckerByConstructor, String name) 
	{
		this.spellCheckerByConstructor = spellCheckerByConstructor;
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public SpellChecker getSpellCheckerByType() {
		return spellCheckerByConstructor;
	}

	public void spellCheck()
	{
		this.spellCheckerByConstructor.checkSpelling();
	}
}
