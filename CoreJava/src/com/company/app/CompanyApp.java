package com.company.app;

import com.company.admin.Department;
import com.company.hr.Employee;

public class CompanyApp {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(121);
		emp.setName("Ajay");
		emp.setSalary(50000);
		emp.showEmployeeDetails();
		
		Department dep = new Department();
		dep.setDeptName("Development");
		dep.setDeptId(0125);
		dep.showDepartmentDetails();

	}

}
