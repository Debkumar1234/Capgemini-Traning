package com.dsa.first_day;

public class RotateArray {
	public static void rotate(int[] arr, int i, int j) {
		int l = i, r = j;
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		// 10,9,8,7,6,5,4,3,2,1
		// 8,9,10,1,2,3,4,5,6,7
		int pos = 3;
		int len = arr.length;
		rotate(arr, 0, len-1);
		rotate(arr, 0, pos-1);
		rotate(arr, pos, len-1);
		for(int i = 0;i<len;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

}
