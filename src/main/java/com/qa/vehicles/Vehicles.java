package com.qa.vehicles;

public abstract class Vehicles {
	private String type;
	protected int wheels;
	private String model;

//CONSTRUCTORS
	public Vehicles(String type, int wheels, String model) {
		this.type = type;
		this.wheels = wheels;
		this.model = model;
	}

	public Vehicles() {
	}

	public abstract double calculatebill();
	
//GETTERS AND SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


//TO STRING
	@Override
	public String toString() {
		return type+ ": WHEELS = " + wheels + ", MODEL = " + model  ;
	}

	
	

}
