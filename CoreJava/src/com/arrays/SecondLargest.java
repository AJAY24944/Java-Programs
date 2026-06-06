package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {12,35,1,10,34,1};
		int max = arr[0];
		int secLargeNum = -1;
		
		for(int ele : arr) {
			if(max > ele) {
				secLargeNum = max;
				max = ele;
			} else if(ele > secLargeNum && ele != max) {
				secLargeNum = ele;
			}
		}
		
		System.out.println(secLargeNum);

	}

}
