package easyProblems;

public class Reverse {
	
	public int reverseNumber(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		Reverse obj1 = new Reverse();
		Reverse obj2 = new Reverse();
		
		System.out.println(obj1.reverseNumber(721));
		System.out.println(obj2.reverseNumber(567));
	}

}
