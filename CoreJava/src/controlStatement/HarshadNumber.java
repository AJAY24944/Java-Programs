package controlStatement;

public class HarshadNumber {
	
	public static boolean isHarshadNumber(int num) {
		int temp = num;
		int sum = 0;
		while(num != 0) {
			int rem = num%10;
			sum = sum + rem;
			num/=10;
		}
		return (temp%sum == 0);
	}

	public static void main(String[] args) {
		
		System.out.println(isHarshadNumber(51) ? "Harshad Number" : "Not Harshad Number");
		
		for(int i=1;i<=100;i++) {
			if(isHarshadNumber(i)) {
				System.out.println(i);
			}
		}

	}

}
