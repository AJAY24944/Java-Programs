package com.test.practice;

import java.util.Scanner;

class Vehicle {
	private String ownerName;
	private String vehicleNumber;
	private String vehicleType;
	
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
	
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		
	}
	public void profile() {
		System.out.println("Owner Name :" + ownerName);
		System.out.println("Vehicle Number :" + vehicleNumber);
		System.out.println("Vehicle Type : "+ vehicleType);
	}
}
class ServiceVehicle extends Vehicle {
	private String serviceCenterName;
	private String serviceCategory;
	
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("Vehicle profile has been created");
	}
	
	public void serviceCategory(String newCategory) {
		if(newCategory == null || newCategory.equals("")) {
			System.out.println("Data not valid please enter proper details");
		}
		else {
			serviceCategory = newCategory;
			System.out.println("Service Category has been Updated");
		}
	}
	
	public void serviceCenterName(String newCenterName) {
		if(newCenterName == null || newCenterName.equals("")) {
			System.out.println("Data not valid please enter proper details");
		}
		else {
			serviceCenterName = newCenterName;
			System.out.println("Service Center Name has been Updated");
		}
	}
	public void profileDetails() {
		profile();
		System.out.println("Service Category :" + serviceCategory);
		System.out.println("Service Center Name : " + serviceCenterName);
	}
	
}
public class VehicleOwnership {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Owner Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Vehicle Number : ");
		String vNum = sc.nextLine();
		System.out.println("Enter Vehicle Type : ");
		String vType = sc.nextLine();
		System.out.println("Enter Service Center Name : ");
		String sCenterName = sc.nextLine();
		System.out.println("Enter Service Category : ");
		String sCategory = sc.nextLine();
		
		ServiceVehicle obj = new ServiceVehicle(name, vNum, vType, sCenterName, sCategory);
		
		
		
		int option = 0;
		boolean status = true;
		
		while(status) {
			System.out.println("=====================================================");
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Update Service Category\r\n"
					+ "2. Update Service Center Name\r\n"
					+ "3. View Vehicle Profile Details\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1 : {
				System.out.println("Update Service Category");
				String cat = sc.nextLine();
				obj.serviceCategory(cat);
				break;
			}
			case 2 : {
				System.out.println("Update Service Center Name");
				String center = sc.nextLine();
				obj.serviceCategory(center);
				break;
			}
			case 3 : {
				System.out.println("Profile Details : ");
				obj.profileDetails();
				break;
			}
			case 4 : {
				System.out.println("Thank you !");
				status = false;
			}
			default : {
				System.out.println("Invalid Option");
				break;
			}
			}
		}
		sc.close();
	}
}
