package com.metacube.training;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is the Spell Checker class.
 * @author Chirag Jain
 *
 */
public class SpellChecker {

	private String word;

	 public void setWord(String word) {
		 this.word=word;
	 }
	/*public SpellChecker(String word) {
		System.out.println("Inside SpellChecker constructor.");
		this.word = word;
	}
	*/
	public String getWord() {
		return word;
	}

	public void checkSpelling(String word) {
		System.out.println("Check Spelling " + getWord());
	}
}
