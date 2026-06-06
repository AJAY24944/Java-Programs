package com.arrays;

class Employee {
	int empId;
	String empName;
	int monthSalary[];
	public Employee(int empId, String empName, int []monthSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.monthSalary = monthSalary;
	}
	
	public double calculateAnnualSalary() {
		int sum = 0;
		for(int ele : monthSalary) {
			sum += ele;
		}
		return sum*12;
	}
	
	public String displayEmployeeDetails() {
		return "[" + "Employee ID : " + empId + "Employee Name  : " + empName + "Employee Salary : " + monthSalary + "]"; 
	}
}


public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee(123, "ajay", new int[] {50000});
		Employee emp2 = new Employee(112, "raju", new int[] {70000});
		
		Employee []empp = {emp1,emp2};
		
		for(Employee err : empp) {
			System.out.println(emp1.calculateAnnualSalary());
			System.out.println(emp2.displayEmployeeDetails());
		}
	}

}
