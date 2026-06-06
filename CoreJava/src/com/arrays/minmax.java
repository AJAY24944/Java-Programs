package com.arrays;

public class minmax {

	public static void main(String[] args) {
		 int[] arr= {3, 9, 2, 5, 6};
		 int maxx=arr[0];
		 int minn=arr[0];
		 
		 for(int n : arr) {
			 if(maxx < n) {
				 maxx = n;
			 }
			 if(minn > n) {
				 minn = n;
			 }
		 }
		 System.out.println("minimum " + minn);
		 System.out.println("maximum " + maxx);

	}

}
