package com.dsa.first_day.homework.string_basics;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This     is a sample string";
		int len = str.length();
		int count = 0;
		int i = 0;
		while(i<len) {
			if(str.charAt(i)==' ') {
				count++;
				while(i<len && str.charAt(i)==' ') {
					i++;
				}
			}else {
				i++;
			}
		}
		count++;
		System.out.println("Number of words : "+count);
	}

}
