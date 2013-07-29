package com.tutorialspoint.javabasedconfig;


public class TextEditor {

	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside Java based config TextEditor constructor");
		this.spellChecker = spellChecker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck()
	{
		this.spellChecker.checkSpelling();
	}
	
}
