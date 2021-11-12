package com.qa.vehicles;

public class Plane extends Vehicles {

	private String make;
	private String country;

//	CONSTRUCTORS
	public Plane(String type, int wheels, String model, String make, String country) {
		super(type, wheels, model);
		this.make = make;
		this.country = country;
	}

	public Plane(String type, int wheels, String model) {
		super(type, wheels, model);
	}

//GETTERS AND SETTERS
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public double calculatebill() {
		double bill= (600.00);
		return bill;
	}

}
