package com.arrays;

class Course {
	String courseName;
	int[] marks;
	
	public Course(String courseName, int[] marks) {
		this.courseName = courseName;
		this.marks = marks;
	}

	public double getMarksAverage() {
		int sum = 0;
		for(int mark : marks) {
			sum += mark;
		}
		return sum/marks.length;
	}
	
}
class Student {
	int rollNumber;
	String name;
	Course course[];

	public Student(int rollNumber, String name, Course[] course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}
	
	public double getOverallAverage() {
		double total =0;
		for(Course c : course) {
			total += c.getMarksAverage();
		}
		return total/course.length;
	}
	
	public void displayStudentPerformance() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Rollno : " + rollNumber);
		
		for(Course c : course) {
			System.out.println(c.courseName + "Average" + c.getMarksAverage());
		}
		
		System.out.println("Overall Average : " + getOverallAverage());
		System.out.println("----------------------------");
	}
}

public class StudentMain {
	
	public static void main(String[] args) {
		
		Course c1 = new Course("Maths", new int[] {45,85,64});
		Course c2 = new Course("Physics", new int[] {75,55,80});
		Course c3 = new Course("English", new int[] {65,35,90});

		Student st = new Student(123, "Ajay", new Course[] {c1,c2,c3});
		st.displayStudentPerformance();
	}

}
