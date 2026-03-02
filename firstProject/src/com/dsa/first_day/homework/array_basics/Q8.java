package com.dsa.first_day.homework.array_basics;

public class Q8 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		boolean flag = true;
		for(int i = 0;i<len-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not sorted");
		}
		
	}

}
