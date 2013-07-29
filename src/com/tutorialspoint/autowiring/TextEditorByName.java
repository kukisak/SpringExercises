package com.tutorialspoint.autowiring;

public class TextEditorByName {

	private SpellCheckerByName spellCheckerByName;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellCheckerByName getSpellCheckerByName() {
		return spellCheckerByName;
	}

	public void setSpellCheckerByName(SpellCheckerByName spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellCheckerByName = spellChecker;
	}
	
	public void spellCheck()
	{
		this.spellCheckerByName.checkSpelling();
	}
}
