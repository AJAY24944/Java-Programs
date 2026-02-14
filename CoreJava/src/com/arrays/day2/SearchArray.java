package com.arrays.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements : ");
		int ele = sc.nextInt();
		int arr[] = new int[ele];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter " + i + " index value : ");
			arr[i] = sc.nextInt();
			}
			
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter search element : ");
		int find	= sc.nextInt();
		boolean found= false;
		
		for(int i=0;i<ele;i++) {
			if(arr[i] == find) {
				System.out.println("Element found at : " +i);
				found = true;
				break;
			}
			else {
				System.out.println("Element not found");
			}
		}
		sc.close();
		
	}

}
