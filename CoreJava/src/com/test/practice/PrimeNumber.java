package com.test.practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public boolean isPrime(int input) {
		if(input <= 1) return false;
		for(int i=2;i<=(int)Math.sqrt(input);i++) {
			if(input%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Input : ");
		int input = sc.nextInt();
		
		PrimeNumber pri = new PrimeNumber();
		System.out.println(pri.isPrime(input) ? "isPrime" : "is Not Prime");
	}

}
