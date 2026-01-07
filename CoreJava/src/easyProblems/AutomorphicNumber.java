package easyProblems;

public class AutomorphicNumber {
	
	public static boolean isAutomophicNum(int num) {
		int square = num*num;
		int temp = num;
		int count = 0;
		
		while(temp > 0) {
			count++;
			temp /= 10;
		}
		
		int lastDigit = square % (int)Math.pow(10, count);
		return lastDigit == num;
	}
	

	public static void main(String[] args) {

		System.out.println(isAutomophicNum(25) ? "Automophic Number" : "Not a Automophic Number");
		System.out.println(isAutomophicNum(32) ? "Automophic Number" : "Not a Automophic Number");
	}
	/*
	 * An Automorphic Number is a number whose square ends with the same digits as the number itself.
	 * 
	 */
}
