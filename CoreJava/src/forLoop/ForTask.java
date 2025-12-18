package forLoop;

public class ForTask {
	
	public void numbers() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public void reverse() {
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public void evenNumbers() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
	}
	
	public void oddNumbers() {
		for(int i=1;i<=15;i++) {
			System.out.println(i*2-1);
		}
	}
	
	public void increasingBy5() {
		for(int i=5;i<=50;i+=5) {
			System.out.println(i);
		}
	}
	public static void main(String []args) {
		ForTask obj1 = new ForTask();
		obj1.numbers();
		System.out.println("------------------------------------------------");
		
		new ForTask().reverse();
		System.out.println("------------------------------------------------");
		
		new ForTask().evenNumbers();
		System.out.println("------------------------------------------------");
		
		ForTask obj2 = new ForTask();
		obj2.oddNumbers();
		System.out.println("------------------------------------------------");
		
		new ForTask().increasingBy5();
	}

}
