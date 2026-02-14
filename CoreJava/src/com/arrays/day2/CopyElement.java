package com.arrays.day2;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		int ele = sc.nextInt();
		int arr[] = new int[ele];
		int copy[] = new int[ele];
		
		for(int i=0;i<ele;i++) {
			System.out.println("Enter " + i + " index value :");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<ele;i++) {
			copy[i] = arr[i];
		}
		System.out.println("Original Array : "+Arrays.toString(arr));
		System.out.println("Copied Array : "+Arrays.toString(copy));
		
		

	}

}
