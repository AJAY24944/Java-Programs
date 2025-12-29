package inheritance;

class College {
	
	public College() {
		System.out.println("Person object created");
	}
}
class Student extends College {
	public Object College;

	public Student() {
		System.out.println("Student object created");
	}
}
public class Person {
	public static void main(String[] args) {
		Student obj = new Student();
		Object college = obj.College;

	}

}
