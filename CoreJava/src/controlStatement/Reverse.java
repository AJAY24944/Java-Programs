package controlStatement;

public class Reverse {
	
	public boolean isReverse(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println("Reversed Number : " + rev);
		return true;
		
	}

	public static void main(String[] args) {
		
		
		Reverse obj = new Reverse();
		obj.isReverse(12345);
		
		
	}

}
