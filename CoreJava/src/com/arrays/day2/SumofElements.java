package com.arrays.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SumofElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter" + i + " index value : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Array Elements : "+Arrays.toString(arr));
		System.out.println("Sum of Array : "+sum);

	}

}
