package com.dsa.first_day.homework.string_basics;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Debkumar Mallick";
		String curr = "";
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				curr = curr+str.charAt(i);
			}
		}
		System.out.println("After remove spaces : "+ curr);
	}

}
