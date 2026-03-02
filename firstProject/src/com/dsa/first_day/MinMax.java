package com.dsa.first_day;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int min = arr[0], max = arr[0];
	
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
 	}

}
