package com.dsa.first_day.homework.array_basics;

public class Q10 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,3,4,5,5,10,5};
		int len = arr.length;
//		int[] copyArr = new int[len];
		int count = 0;
		for(int i = 0;i<len;i++) {
			if(arr[i]==-1) continue;
			boolean isDup = false;
			for(int j = i+1;j<len;j++) {
				if(arr[i] == arr[j]) {
					isDup = true;
					arr[j] = -1;
				}
			}
			if(isDup) {
				count++;
			}
		}
		System.out.println("The number of total duplicate number : "+count);
	}

}
