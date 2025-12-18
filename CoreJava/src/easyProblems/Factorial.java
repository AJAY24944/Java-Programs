package easyProblems;

public class Factorial {
	
	public boolean isFactorial(int num) {
		int fact = 1;
		int i= 1;
		while(fact < num) {
				
				fact = fact * i;
				i++;
			}
		System.out.println(fact);
		return fact == num;
	}

	public static void main(String[] args) {
		Factorial obj1 = new Factorial();
		obj1.isFactorial(3);

	}

}
