package controlStatement;

public class Reverse {
	
	public boolean isReverse(int num) {
		int temp = num;
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return temp == rev;
		
	}

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.isReverse(123)?"Palindrome" : "Not Palindrome");
		
		
	}

}
