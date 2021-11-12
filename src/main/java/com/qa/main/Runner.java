package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Bike;
import com.qa.vehicles.Car;
import com.qa.vehicles.Plane;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Car", 4, "Audi", 2013, 80000, "Petrol");
		Plane plane = new Plane("Plane", 6, "Jet", "Emirates", "England");
		Bike bike = new Bike("Bike", 2, "BMX", "adult", 28, "red");
		Garage garage = new Garage();
		
		garage.print();
		garage.addVehicles(bike);
		garage.addVehicles(car);
		garage.addVehicles(plane);
		garage.printVehicles();
		garage.fixVehicle(car);
		garage.fixVehicle(bike);
		garage.fixVehicle(plane);
		garage.repaired(bike);
		garage.removeVehicles(bike);
		garage.print();
		garage.printVehicles();

	}

}
