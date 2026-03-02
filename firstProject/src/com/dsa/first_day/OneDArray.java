package com.dsa.first_day;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = userInput.nextInt();
		int[] arr = new int[n]; // 1D array
//		int m = userInput.nextInt();
//		int n = userInput.nextInt();
//		int[][] twoDArray = new int[m][n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = userInput.nextInt();
		}
//		for(int i = 0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		int pos = 2;
//		int[] arr1 = new int[arr.length + 1];
//		for (int i = 0; i < arr1.length; i++) {
//			if (i == pos) {
//				arr1[i] = 30;
//			} else if (i < pos) {
//				arr1[i] = arr[i];
//			} else {
//				arr1[i] = arr[i - 1];
//			}
//		}
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		int ele = 20;
		System.out.println();
//		for(int i = pos;i<arr1.length-1;i++) {
//			arr1[i] = arr1[i+1];
//		}
//		arr1[arr1.length-1] = 0;
//		for(int i = 0;i<arr1.length;i++) {
//			System.out.print(arr1[i]+ " ");
//		}
		int adjust = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele) {
				adjust++;
			}else {
				arr[i - adjust] = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
//	{ 12, 12, 20, 12, 20, 12}
	// 10 5 8 5 0 0 

}
