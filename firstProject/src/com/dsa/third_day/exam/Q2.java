package com.dsa.third_day.exam;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDArr = new int[10][10];
		for(int i = 0;i<twoDArr.length;i++) {
			for(int j = 0;j<twoDArr[0].length;j++) {
				twoDArr[i][j] = i+j;
				System.out.print(twoDArr[i][j]+ " ");
			}
			System.out.println();
		}
		int sum = 0;
		for(int i = 0;i<twoDArr.length;i++) {
			for(int j = 0;j<twoDArr[0].length;j++) {
				sum += twoDArr[i][j];
			}
		}
		System.out.println("Sum of all elements : "+sum);	
	}

}
