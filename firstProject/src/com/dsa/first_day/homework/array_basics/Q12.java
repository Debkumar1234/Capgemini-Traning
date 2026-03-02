package com.dsa.first_day.homework.array_basics;

public class Q12 {

	public static void main(String[] args) {
		String str = "debkumar";
//		System.out.println(('d'+'e'+'b')); 4+5+2 = 9
		int targetSum = 9;
		int len = str.length();
		int l = -1, r = 0;
		int currSum = 0;
		int index = -1;
		while(l<r && r<len) {
			if(currSum<targetSum) {
				currSum+=(str.charAt(r)-'a'+1);
				r++;
			}else if(currSum>targetSum) {
				currSum-=(str.charAt(++l)-'a'+1);
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
