package controlStatement;

public class UglyNumber {
	
	public static boolean isaUglyNumber(int num) {
		if(num <= 0) return false;
		while(num != 0) {
			if(num%2 == 0) {
				num/=2;
			}
			else if(num%3 == 0) {
				num/=3;
			}
			else if(num%5 == 0) {
				num/=5;
			}
			else {
				break;
			}
		}
		return num == 1;
	}

	public static void main(String[] args) {
		
		UglyNumber obj = new UglyNumber();
		System.out.println(obj.isaUglyNumber(155) ? "Ugly Number" : "Not Ugly Number");
		
		
		for(int i=1;i<=100;i++) {
			if(obj.isaUglyNumber(i)) {
				System.out.println(i);
			}
		}

	}

}
