package com.metacube.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved. This is the main class.
 * This is main class.
 * @author Chirag Jain
 *
 */
public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person person = (Person) context.getBean("person");
		person.checkType();
		person.setType("Admin");
		person.checkType();
		Person otherPerson = (Person) context.getBean("person");
		otherPerson.checkType();
	}

}
