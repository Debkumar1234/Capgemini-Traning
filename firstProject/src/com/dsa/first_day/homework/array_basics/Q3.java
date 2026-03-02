package com.dsa.first_day.homework.array_basics;

public class Q3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Elements of the array : ");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("Sum of the array elements : "+sum);
		System.out.println("Average of the array : "+ ((double)sum/arr.length));
	}

}
