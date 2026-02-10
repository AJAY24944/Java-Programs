package com.inheritance;

class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle Make : "+make);
		System.out.println("Vehicle Model : "+model);
		System.out.println("Vehicle Year : " +year);
	}
}

class Car extends Vehicle {
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo() {
		System.out.println("Vehicel Number of Doors : "+numberOfDoors);
		System.out.println("This is Car from derived Class");
	}
	
}

class Truck extends Vehicle {
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void displayTruckInfo() {
		System.out.println("Vehicle Cargo Capacity : "+cargoCapacity);
		System.out.println("This is Truck from derived Class");
	}
}

class Motorcycle extends Vehicle {
	Boolean hasSideCar;

	public Motorcycle(String make, String model, int year, Boolean hasSideCar) {
		super(make, model, year);
		this.hasSideCar = hasSideCar;
	}
	
	public void displayMotorcycleInfo() {
		System.out.println("Vehicle Has side car : "+hasSideCar);
		System.out.println("This is Motor Cycle from derived Class");
	}
}
public class VehicleMain {
	public static void main(String[] args) {
		
		Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
		car.displayInfo();
		((Car) car).displayCarInfo();
		
		System.out.println("-----------------------------------");
		
		Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
		truck.displayInfo();
		((Truck) truck).displayTruckInfo();
		
		System.out.println("-----------------------------------");

		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, false);
		motorcycle.displayInfo();
		((Motorcycle) motorcycle).displayMotorcycleInfo();

	}
}
