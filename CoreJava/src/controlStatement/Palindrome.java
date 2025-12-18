package controlStatement;

public class Palindrome {
	
	public boolean isPalindrome(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev= rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		return false;
	}

	public static void main(String[] args) {
		new Palindrome().isPalindrome(12345);
	}

}
