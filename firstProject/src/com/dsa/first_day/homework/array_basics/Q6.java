package com.dsa.first_day.homework.array_basics;

public class Q6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Elements of the array : ");
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			if(arr[i]>max2 && max1!=arr[i]) {
				max2 = arr[i];
			}
		}
		System.out.println("Second max element : "+max2);
	}

}
