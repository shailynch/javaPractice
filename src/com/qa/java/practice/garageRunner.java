package com.qa.java.practice;

public class garageRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car trialVehicle = new Car();
		System.out.println(Car.getCounter());
		Garage shaisGarage = new Garage();
		shaisGarage.addVehicle(trialVehicle);
		System.out.println(trialVehicle.getVehicleId());
	}

}
