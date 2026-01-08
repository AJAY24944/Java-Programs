package com.test.practice;

import java.util.Scanner;

class InsurancePolicy {
	private String customerName;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;
	
	public InsurancePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
			String policyStatus) {
		this.customerName = customerName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		this.approvedAmount = approvedAmount;
		this.policyStatus = "Pending";
		System.out.println("Policy record has been created.");
	}
	
	public void updateApprovedAmount(double amount) {
		if(amount >= 0 && amount <= approvedAmount) {
			approvedAmount = amount;
			System.out.println("Approved Amount Updated Successfully");
		}
		else {
			System.out.println("Invalid approved Amount,update failed");
		}
	}
	
	public void updatePolicyStatus(String newPolicyStatus) {
		policyStatus = newPolicyStatus;
		System.out.println("Policy status updated successfully.");
	}
	public void summary() {
		System.out.println("Customer Name : " + customerName);
		System.out.println("Policy Type : " + policyType);
		System.out.println("Policy Amount : " + policyAmount);
		System.out.println("Approved Amount : " + approvedAmount);
		System.out.println("Policy Status : " + policyStatus);
	}
	
}

public class InsuranceCompany {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Policy Type : ");
		String type = sc.nextLine();
		System.out.println("Enter Policy Amount :");
		double amount = sc.nextDouble();
		System.out.println("Enter Approved Amount : ");
		double approved = sc.nextDouble();
		System.out.println("Enter Policy Status : ");
		String status = sc.nextLine();
		
		InsurancePolicy ip = new InsurancePolicy(name, type, amount, approved, status);
		
		int option = 0;
		boolean policy = true;
		while(policy) {
			System.out.println("===========================================");
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Update Approved Amount\r\n"
					+ "2. Change Policy Status\r\n"
					+ "3. View Policy Summary\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1 : {
				System.out.println("Update Approved Amount");
				double aAmount = sc.nextDouble();
				ip.updateApprovedAmount(aAmount);
				break;
			}
			case 2 : {
				System.out.println("Change Policy Status");
				String pStatus = sc.nextLine();
				ip.updatePolicyStatus(pStatus);
				break;
			}
			case 3 : {
				System.out.println("View Policy Summary \n");
				ip.summary();
				break;
			}
			case 4 : {
				System.out.println("Thank You !");
				policy = false;
			}
			}
		}
		sc.close();

	}

}
