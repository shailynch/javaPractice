package com.qa.java.practice;

public class Vehicle {
	private int wheels;
	private String fuelType;
	private int engineSize;
	private String transmission;
	private boolean airbag;
	private int numberOfDoors;
	private int passengarCapacity;
	private static int counter;
	private int vehicleId;

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getPassengarCapacity() {
		return passengarCapacity;
	}

	public void setPassengarCapacity(int passengarCapacity) {
		this.passengarCapacity = passengarCapacity;
	}

	public static int getCounter() {
		return counter;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public Vehicle() {
		vehicleId = counter++;

	}
}
