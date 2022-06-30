package com.qa.java.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class ClassExampleRunner {

	public static void main(String[] args) {
		ClassExample firstCustomer = new ClassExample("Shai", "Lynch", LocalDate.of(1998, 6, 15), "8", "e12rp");
		ClassExample secondCustomer = new ClassExample("Paul", "forester", LocalDate.of(1973, 9, 15), "8", "se26ww");

		firstCustomer.checkAge();
		System.out.println(ClassExample.customerCounter);

		// take input to set cust
		Scanner sc = new Scanner(System.in);
		// to take input
		System.out.println("Enter your first name: ");
		String firstNameEntry = sc.next();
		System.out.println("Enter your last name: ");
		String lastNameEntry = sc.next();
		System.out.println("Enter your DOB: yyyy-mm-dd ");
		String stringDOBEntry = sc.next();
		LocalDate dobEntry = LocalDate.parse(stringDOBEntry);
		System.out.println("Enter your House name/number");
		String houseNameNumberEntry = sc.next();
		System.out.println("Enter your postcode");
		String postcodeEntry = sc.next();
		sc.close();

		ClassExample inputtedCustomer = new ClassExample(firstNameEntry, lastNameEntry, dobEntry, houseNameNumberEntry,
				postcodeEntry);
		System.out.println(inputtedCustomer.getFirstName());
	}

}
