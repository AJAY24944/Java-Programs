package easyProblems;

public class DuckNumber {
	
	public boolean isDuckNumber(int num) { 
		boolean zero = false;
		
		if(num == 0) return false;
		while(num > 0) {
			int rem = num%10;
			if(rem == 0) {
				zero = true;
				break;
			}
			num /= 10;
		}
		return zero;
	}

	public static void main(String[] args) {
		DuckNumber duck = new DuckNumber();
		System.out.println(duck.isDuckNumber(052)? "Duck Number" : "Not a Duck Number");
		System.out.println(duck.isDuckNumber(5302)? "Duck Number" : "Not a Duck Number");
	}
	/*
	 * 
	 * A Duck Number is a positive number that contains at least one zero (0) in it, 
	 * but does NOT start with zero.
	 * 
	 */
}
