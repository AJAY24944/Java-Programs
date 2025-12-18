package controlStatement;

public class NeonNumber {
	
	public boolean isNeonNumber(int num) {
		int square = num*num;
		int sum = 0;
		while(square != 0) {
			int rem = square%10;
			sum = sum+rem;
			square/=10;
		}
		System.out.println(sum);
		return sum == num;
		
	}

	public static void main(String[] args) {
		NeonNumber obj =new NeonNumber();
		System.out.println(obj.isNeonNumber(9) ? "Neon Number" : "Not Neon Number");
		
		for(int i=1;i<=100;i++) {
			if(obj.isNeonNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
