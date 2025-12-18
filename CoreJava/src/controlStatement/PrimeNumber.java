package controlStatement;

public class PrimeNumber {
	
	public boolean isPrime(int num) {
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		return count == 2;
	}
	
	public boolean isItPrime(int num) {
		if(num <= 1) return false;
		for(int i = 2 ;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isAPrimeNumber(int num) {
		if(num <= 1) return false;
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = new PrimeNumber().isPrime(2);
		System.out.println(result ? "Is a Prime Number" : "Is Not a Prime Number");
		System.out.println("-------------------------------------------------------------");
		

		System.out.println(new PrimeNumber().isItPrime(52) ? "Is a Prime Number" : "Is not a Prime Number");
		System.out.println("-------------------------------------------------------------");
		
		PrimeNumber obj = new PrimeNumber();
		System.out.println(obj.isAPrimeNumber(5) ? "Is a Prime Number" : "Is Not a Prime Number");
		
		
//		for(int i=1;i<=100;i++) {
//			if(obj.isAPrimeNumber(i)) {
//				System.out.println(i);
//			}
//		}
	}
}
