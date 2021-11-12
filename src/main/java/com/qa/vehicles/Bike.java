package com.qa.vehicles;

public class Bike extends Vehicles {

	private String size;
	private int height;
	private String colour;

//	CONSTRUCTORS
	public Bike(String type, int wheels, String model, String size, int height, String colour) {
		super(type, wheels, model);
		this.size = size;
		this.height = height;
		this.colour = colour;
	}

	public Bike(String type, int wheels, String model) {
		super(type, wheels, model);
	}

//	GETTERS AND SETTERS
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public double calculatebill() {
		double bill= (50.00);
		return bill;
	}

}
