package com.test.practice;

import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping : ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
		sc.close();

	}

}
