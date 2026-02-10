package com.inheritance;

class Employee {
	String name;
	double baseSalary;
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public void calculateAnnualSalary() {
		System.out.println("Total Annual Salary : "+baseSalary*12);
	}
}

class Manager extends Employee {
	double bonus;
	int numberOfEmployeesManaged;
	
	public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}

	public void calculateManagerSalary() {
		System.out.println("Total Annual Salary with bonus : "+(bonus+baseSalary));
	}
}

class Engineer extends Employee {
	int projectCount;
	
	public Engineer(String name, double baseSalary, int projectCount) {
		super(name, baseSalary);
		this.projectCount = projectCount;
	}

	public void calculateEngineerSalary() {
		System.out.println("Total Salary based on project count : " + (baseSalary +(projectCount*10000)));
	}
}

class Salesperson extends Employee {
	double commissionRate , totalSales;

	public Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
		super(name, baseSalary);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	
	public void calculateSalespersonSalary() {
		System.out.println("Total salary including commision based on TotalSales : " + (baseSalary + (commissionRate*totalSales)));
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee man = new Manager("Alice", 50000, 10000, 5);
		man.calculateAnnualSalary();
		((Manager) man).calculateManagerSalary();
		
		System.out.println("------------------------------------");
		
		Employee eng = new Engineer("Bob", 70000, 5);
		eng.calculateAnnualSalary();
		((Engineer) eng).calculateEngineerSalary();
		
		System.out.println("------------------------------------");

		Employee sales = new Salesperson("Charlie", 40000, 0.1, 200000);
		sales.calculateAnnualSalary();
		((Salesperson) sales).calculateSalespersonSalary();

	}

}
