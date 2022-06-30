package com.qa.java.practice;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName;
	private String lastName;
	private String jobTitle;
	private LocalDate dob; // yyyy,m,d
	private String houseNameNumber;
	private String postcode;
	static int customerCounter;

	public Person(String firstName, String lastName, String jobTitle, LocalDate dob, String houseNameNumber,
			String postcode) {
		// constructor
		customerCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.dob = dob; // yyyy,m,d
		this.houseNameNumber = houseNameNumber;
		this.postcode = postcode;

	}

	// getters and setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getDOB() {
		return this.dob;
	}

	public void setDOB(LocalDate dob) {
		this.dob = dob;
	}

	public String checkAge() {
		Period period = Period.between(this.dob, LocalDate.now());
		return (period.getYears() + " years " + period.getMonths() + " and " + period.getDays() + " days");
	}

	public String getHouseNameNumber() {
		return houseNameNumber;
	}

	public void setHouseNameNumber(String houseNameNumber) {
		this.houseNameNumber = houseNameNumber;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;

	}

}
