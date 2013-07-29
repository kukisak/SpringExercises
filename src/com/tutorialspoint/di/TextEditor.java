package com.tutorialspoint.di;

public class TextEditor {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck()
	{
		this.spellChecker.checkSpelling();
	}
}
