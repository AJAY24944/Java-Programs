package com.test.practice;

import java.util.Scanner;

class SalesEmployee {
	private String employeeName;
	private int employeeId;
	
	public SalesEmployee(String employeeName, int employeeId) {
		
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		
	}
	public void profile() {
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Id : " + employeeId);
	}
	
}

class PerformanceEmployee extends SalesEmployee {
	private int count;
	private double totalSales;
	private double averageSales;
	private String performanceGrade;
	
	public PerformanceEmployee(String employeeName, int employeeId, int count, double totalSales, double averageSales,
			String performanceGrade) {
		super(employeeName, employeeId);
		this.count = 0;
		this.totalSales = totalSales;
		this.averageSales = averageSales;
		this.performanceGrade = performanceGrade;
		
		System.out.println("Performance Profile Created");
	}


	public void addSales(double amount) {
		if(amount > 0) {
			totalSales += amount;
			count++;
			System.out.println("Sales Entry Added");
		}
		else {
			System.out.println("Invalid sales amount, entry not added");
		}
	}
	public void recalculateResults() {
		if(count == 0) {
			System.out.println("No sales data Available");
			return ;
		}
		averageSales = totalSales / count;
		
		if(averageSales >= 15000) {
			performanceGrade = "Excellent";
		}
		else if(averageSales >= 10000) {
			performanceGrade = "Good";
		}
		else {
			performanceGrade = "Average";
		}
		System.out.println("Performance recalculated successfully.");
	}
	
	public void summary() {
		profile();
		System.out.println("Total Sales : "+totalSales);
		System.out.println("Average Sales : " + averageSales);
		System.out.println("Performance Grade : " + performanceGrade);
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		
		PerformanceEmployee emp = new PerformanceEmployee(name, id, id, id, id, name);
		
		int option = 0;
		boolean running = true;
		while(running) {
			
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Add Sales Entry\r\n"
					+ "2. Recalculate Performance Result\r\n"
					+ "3. View Performance Summary\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1 : {
				System.out.println("Add Sales Entry");
				double add = sc.nextDouble();
				emp.addSales(add);
				break;
			}
			case 2 : {
				System.out.println("Recalculate Performance Results ");
				emp.recalculateResults();
				break;
			}
			case 3 : {
				System.out.println("View Performance Summary \n");
				emp.summary();
				break;
			}
			case 4 : {
				System.out.println("Thank You !");
				running = false;
			}
			}
		}
		sc.close();
	}

}
