package com.school.staff;

public class Principal {
	
	private String principalName;
	private int experienceYears;
	
	public void setPrincipal(String principalName) {
		this.principalName = principalName;
	}
	public void setExperience(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public String getPrincipal() {
		return principalName;
	}
	public int getExperience() {
		return experienceYears;
	}
	
	public void showPrincipalInfo() {
		System.out.println("Principal Name : " + principalName);
		System.out.println("Experience Years : " + experienceYears);
	}

}
