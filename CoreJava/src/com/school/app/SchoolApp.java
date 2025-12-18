package com.school.app;

import com.school.management.School;
import com.school.staff.Principal;

public class SchoolApp {

	public static void main(String[] args) {
		
		School scl = new School();
		scl.setName("Indian Public School");
		scl.setLocation("Hyderabad");
		scl.showSchoolInfo();
		
		Principal pri = new Principal();
		pri.setPrincipal("Ajay Nani");
		pri.setExperience(15);
		pri.showPrincipalInfo();

	}

}
