package com.tutorialspoint.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;
	@Autowired
	private EnhancedSpellChecker enhSpellChecker;
	
	private ConstructorEnhancedSpellChecker constEnhancedSpellChecker;
	private String name;

	
	@Autowired
	public TextEditor(ConstructorEnhancedSpellChecker constEnhancedSpellChecker) 
	{
		this.constEnhancedSpellChecker = constEnhancedSpellChecker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) 
	{
		System.out.println("Inside TextEditor setSpellChecker");
		this.spellChecker = spellChecker;
	}

	public EnhancedSpellChecker getEnhSpellChecker() {
		return enhSpellChecker;
	}

	public void spellCheck()
	{
		this.spellChecker.checkSpelling();
	}
	
	public void enhSpellCheck()
	{
		this.enhSpellChecker.checkSpelling();
	}
	
	public void constEnhSpellCheck()
	{
		this.constEnhancedSpellChecker.checkSpelling();
	}
	
	
}
