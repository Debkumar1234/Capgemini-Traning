package com.dsa.first_day.homework.array_basics;

public class Q11 {

	public static void main(String[] args) {
		String str = "debkumar";
//		System.out.println(('d'+'e'+'b'));
		int targetSum = 333;
		int len = str.length();
		int l = -1, r = 0;
		int currSum = 0;
		int index = -1;
		while(l<r && r<len) {
			if(currSum<targetSum) {
				currSum+=str.charAt(r);
				r++;
			}else if(currSum>targetSum) {
				currSum-=str.charAt(++l);
			}else {
				index = l+1;
				break;
			}
		}
		if(index!=-1) {
			System.out.println("starting index of a substring whose sum equals K : "+index);
		}else {
			System.out.println("Target sum not found in any substring");
		}
		
		
	}

}
