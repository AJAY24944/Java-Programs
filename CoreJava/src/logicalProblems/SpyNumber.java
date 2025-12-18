package logicalProblems;

public class SpyNumber {
	public static boolean isSpy(int n) {
	int sum = 0, prod = 1;
	int temp = Math.abs(n);
	while (temp > 0) {
		int d = temp % 10;
		sum += d;
		prod *= d;
		temp /= 10;
	}
	return sum == prod;
	}
}

