package logicalProblems;

public class PerfectNumber {
	
	public static boolean perfectNumber(int num) {
		if(num <= 0) return false;
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i == 0) {
				sum = sum+i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		boolean result = new PerfectNumber().perfectNumber(28);
		System.out.println(result ? "Perfect Number" : "Not a Perfect Number");
		
		
		for(int i=1;i<=10000;i++) {
			if(perfectNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
