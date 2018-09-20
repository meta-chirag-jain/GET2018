package com.metacube.training;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is the Text Editor class.
 * @author Chirag Jain
 *
 */
public class TextEditor {

	private SpellChecker spellChecker;

    // a constructor method to inject the dependency.
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck(String word) {
        spellChecker.checkSpelling(word);
    }
}
