package logicalProblems;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		return count == 2;
	}


public static void main(String args[]){
	PrimeNumber pri = new PrimeNumber();
	System.out.println(pri.isPrimeNumber(6)? "Is Prime" : "! Prime");
	
}
}
