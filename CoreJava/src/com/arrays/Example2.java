package com.arrays;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int c[] = new int[a.length + b.length+1];
		
		for(int i=1;i<c.length;i++) {
			c[i] = i;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
