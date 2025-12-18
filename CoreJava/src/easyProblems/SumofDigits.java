package easyProblems;

public class SumofDigits {
	
	public int sumDigits(int num) {
		int sum = 0;
		while(num != 0) {
			int result = num%10;
			sum =sum + result;
			num /= 10;		
		}
		return sum;
	}

	public static void main(String[] args) {
		
		SumofDigits obj1 = new SumofDigits();
		SumofDigits obj2 = new SumofDigits();
		System.out.println(obj1.sumDigits(101));
		System.out.println(obj2.sumDigits(567));
	}

}
