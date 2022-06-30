package com.qa.java.practice;

import java.util.ArrayList;

public class PersonManager {
	private ArrayList<Person> personManager = new ArrayList<Person>();

	public PersonManager() {

	}

	public void addPerson(Person person) {
		personManager.add(person);
	}

	public Person findPerson(String name) {
		for (Person p : personManager) {
			if (p.getFirstName().equals(name)) {
				return p;
			}
		}
		return null;
	}
}
