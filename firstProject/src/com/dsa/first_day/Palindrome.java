package com.dsa.first_day;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		int len = str.length();
		for(int i = 0;i<len;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("It's a palindrome string");
	}

}
