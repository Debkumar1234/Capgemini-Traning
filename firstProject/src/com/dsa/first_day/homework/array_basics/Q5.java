package com.dsa.first_day.homework.array_basics;

public class Q5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int value = 4;
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		if(index!=-1) {
			System.out.println("Element present at index : "+index);
		}else {
			System.out.println("Element not found");
		}
	}

}
