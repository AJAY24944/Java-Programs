package com.arrays.day2;

import java.util.Arrays;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Element : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		int evencount = 0;
		int oddcount = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter " + i + "index value");
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0) {
//				System.out.println("Even Number");
				evencount++;
			}
			else {
//				System.out.println("Odd Number");
				oddcount++;
			}
			

		}
		System.out.println("Array Elements : "+ Arrays.toString(arr));
		System.out.println("Even count : " +evencount);
		System.out.println("Odd count : " + oddcount);
		
		
		

	}

}
