package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		if(size <= 0 || size >= 10) {
			System.out.println("Invalid Size");
			return;
		}
		
		String arr1[] = new String[size];

		
		for(int i=0;i<size;i++) {
			System.out.println("Enter"+ i + " index value");
			arr1[i] = sc.next();
		}
		System.out.println(Arrays.toString(arr1));
		sc.close();
	}

}
