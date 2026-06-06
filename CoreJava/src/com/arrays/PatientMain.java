package com.arrays;

import java.util.Arrays;

class Patient {
	int patientId;
	String name;
	double testResults[];
	
	public Patient(int patientId, String name, double[] testResults) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.testResults = testResults;
	}
	
	public double getAverageResult() {
		double average = 0;
		for(double avg : testResults) {
			average += avg;
		}
		return average/testResults.length;
	}
	
	public boolean hasCriticalValues() {
		for (double value : testResults) {
            if (value < 50) {
                return true;
            }
        }
        return false;
	}
	
	public void displayPatientReport() {
		System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Test Results: " + Arrays.toString(testResults));
        System.out.println("Average Result: " + getAverageResult());
        System.out.println("----------------------------------");
	}
	
}
public class PatientMain {

	public static void main(String[] args) {

		Patient[] patients = new Patient[5];

        patients[0] = new Patient(101, "Ajay", new double[]{78, 82, 91, 88, 76});

        patients[1] = new Patient(102, "Rahul", new double[]{45, 60, 55, 70, 80});

        patients[2] = new Patient(103, "Sneha", new double[]{92, 89, 95, 90, 94});

        patients[3] = new Patient(104, "Vikky", new double[]{30, 40, 35, 60, 50});

        patients[4] = new Patient(105, "Anjali", new double[]{85, 88, 90, 92, 87});
        
        System.out.println("Patients With Critical Values:\n");
        
        for(Patient ele : patients) {
        		if(ele.hasCriticalValues()) {
        			ele.displayPatientReport();
        		}
        }
	}

}
