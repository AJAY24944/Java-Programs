package forLoop;

public class EvenOddNumber {
	
	public void getEven() {
		for(int i=1;i<=200;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void getOdd() {
		for(int i=1;i<=200;i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		new EvenOddNumber().getEven();
		System.out.println("--------------------------------------------------------");
		new EvenOddNumber().getOdd();
	}

}
