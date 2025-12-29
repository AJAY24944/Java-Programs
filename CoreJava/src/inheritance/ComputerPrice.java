package inheritance;

class Computer {
	
	void showBrand() {
		System.out.println("Brand: Dell");
	}
}
class Laptop extends Computer{
	void showModel() {
		System.out.println("Model: XPS 15");
	}
}
public class ComputerPrice {
	public static void main(String[] args) {
		Laptop obj =new Laptop();
		obj.showBrand();
		obj.showModel();

	}

}
