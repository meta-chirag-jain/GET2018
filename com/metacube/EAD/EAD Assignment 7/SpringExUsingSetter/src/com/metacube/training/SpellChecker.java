package com.metacube.training;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is the Spell Checker class.
 * @author Chirag Jain
 *
 */
public class SpellChecker {

	private boolean status;
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void checkStatus() {
		System.out.println("Spelling check is " + getStatus());
	}	
}
