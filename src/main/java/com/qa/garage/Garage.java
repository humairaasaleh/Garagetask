package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicles.Vehicles;

public class Garage {

	ArrayList<Vehicles> vehiclesList = new ArrayList<Vehicles>();

	public void addVehicles(Vehicles vehicle) {
		vehiclesList.add(vehicle);
	}

	public void removeVehicles(Vehicles vehicle) {
		vehiclesList.remove(vehicle);
	}

	public void fixVehicle(Vehicles vehicle) {
		System.out.println(" ");
		System.out.println("-----REPAIR BILLS-----");
		System.out.print(vehicle.getType() + ": REPAIR BILL = £");
		System.out.println(vehicle.calculatebill());
	}

	public void clearList() {
		vehiclesList.clear();
	}

	public void printVehicles() {
		for (Vehicles Vehicle : vehiclesList) {
			System.out.println(Vehicle);
		}
	}

	public void repaired(Vehicles vehicle) {
		System.out.println(" ");
		System.out.println("-----REPAIRED-----");
		System.out.println(vehicle.getType() + " HAS BEEN REPAIRED");
		System.out.println(" ");
	}

	public void print() {
		System.out.println("VEHICLES TO REPAIR:");
		System.out.println(" ");
	}

}
