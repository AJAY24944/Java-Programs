package forLoop;

public class EvenNumber {
	
	public void getEven() {
		for(int i=1;i<=200;i++) {
			System.out.println(i*2);
		}
	}
	
	public static void main(String[] args) {
		new EvenNumber().getEven();
	}

}
