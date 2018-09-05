package com.metacube.training;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved. This is the Text Editor class.
 * This class declare person.
 * @author Chirag Jain
 *
 */
public class Person {

	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void checkType() {
		System.out.println(type);
	}
}
