package controlStatement;

public class Palindrome {
	
	public boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev= rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		return temp == rev;
	}

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome(121) ? "Palindrome" : "Not Palindrome");
	}

}
