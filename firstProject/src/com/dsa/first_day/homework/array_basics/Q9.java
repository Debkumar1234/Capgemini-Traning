package com.dsa.first_day.homework.array_basics;

public class Q9 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		int[] copyArr = new int[len];
		for(int i = 0;i<len;i++) {
			copyArr[i] = arr[i];
			System.out.print(copyArr[i]+" ");
		}
	}

}
