package com.dsa.first_day.homework.string_basics;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "debkumar";
		char[] charArr = str.toCharArray();
		int len = str.length();
		for(int i = 0;i<len/2;i++) {
			char temp = charArr[i];
			charArr[i] = charArr[len-i-1];
			charArr[len-i-1] = temp;
		}
		String reverseStr = new String(charArr);
		System.out.println("Reversed String : "+reverseStr);
	}

}
