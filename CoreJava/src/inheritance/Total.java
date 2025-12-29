package inheritance;

class Employee {
	
	double salary = 50000;
}
class Manager extends Employee {
		double bonus = 20000;
	}
class Total {
	public static void main(String[] args) {
		
		Manager obj = new Manager();
		System.out.println(obj.salary + obj.bonus);

	}

}
