package com.qa.java.practice;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public Garage() {
		// TODO Auto-generated constructor stub
	}

}
