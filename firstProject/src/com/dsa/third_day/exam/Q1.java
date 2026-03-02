package com.dsa.third_day.exam;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 1, 2, 3, 4, 9, 10, 7, 8};
		if(arr.length<3) {
			System.out.println("There are no 3rd max element");
			return;
		}
		int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max2;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i]>max2) {
				max3 = max2;
				max2 = arr[i];
			}else if(arr[i]>max3){
				max3 = arr[i];
			}
		}
		System.out.println("3rd max element : "+max3);
	}

}
