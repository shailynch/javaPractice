package com.qa.java.practice;

import java.time.LocalDate;

public class PersonRunner {

	public static void main(String[] args) {
		Person shai = new Person("Shai", "Lynch", "QA trainee", LocalDate.of(1998, 6, 15), "8", "ss26rw");
		PersonManager manager = new PersonManager();
		manager.addPerson(shai);
		manager.findPerson("shai");
		System.out.println(shai.checkAge());
		System.out.println(shai.getFirstName());

	}

}
