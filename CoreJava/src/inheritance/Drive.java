package inheritance;

class Vehicle {
	
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle {
	void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
}
public class Drive {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.run();
		obj.speed();
	}

}
