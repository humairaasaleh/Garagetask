package com.qa.vehicles;

public class Car extends Vehicles {

	private int year;
	private int miles;
	private String fuel;

//CONSTRUCTORS

	public Car(String type, int wheels, String model) {
		super(type, wheels, model);
	}

	public Car(String type, int wheels, String model, int year, int miles, String fuel) {
		super(type, wheels, model);
		this.year = year;
		this.miles = miles;
		this.fuel = fuel;
	}

//	GETTERS AND SETTERS

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public double calculatebill() {
		double bill= (200.00);
		return bill;
	}

//	@Override
//	public String toString() {
//		return "Car [year=" + year + ", miles=" + miles + ", fuel=" + fuel + "]";
//	}


	

}
