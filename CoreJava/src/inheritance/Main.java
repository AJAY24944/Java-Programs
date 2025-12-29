package inheritance;

class Animal {
	
	void display() {
		System.out.println("This is an animal");
	}
}
class Dog extends Animal {
	
}
class Main {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.display();
	}
}
