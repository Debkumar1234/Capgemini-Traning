package com.dsa.first_day.homework.string_basics;

public class Q4 {

	public static void main(String[] args) {
		// check wheather two string are equal
		String str1 = "debkumar";
		String str2 = "debkumar mallick";
		if(str1.length()!=str2.length()) {
			System.out.println("Not Equal");
			return;
		}
		for(int i = 0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				System.out.println("Not Equal");
				return;
			}
		}
		System.out.println("Equal");
	}

}
