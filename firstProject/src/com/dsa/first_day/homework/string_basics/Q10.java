package com.dsa.first_day.homework.string_basics;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0101010";
		for(int i = 0;i<str.length();i++) {
			char currChar = str.charAt(i);
			if(!(currChar=='1' || currChar=='0')) {
				System.out.println("Not a binary string.");
				return;
			}
		}
		System.out.println("It's a binary string");
	}

}
