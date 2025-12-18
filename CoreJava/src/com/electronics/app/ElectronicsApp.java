package com.electronics.app;

import com.electronics.brands.Manufacturer;
import com.electronics.devices.Laptop;

public class ElectronicsApp {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setModel("Apple 17Pro");
		lap.setPrice(12000);
		
		lap.getModel();
		lap.getPrice();
		lap.showLaptopDetails();
		
		Manufacturer man = new Manufacturer();
		man.setBrandName("Apple");
		man.setCountry("India");
		
		man.getBrandName();
		man.getCountry();
		man.showManufacturerDetails();

	}

}
