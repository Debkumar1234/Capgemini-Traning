package com.dsa.first_day.homework.string_basics;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a sample string";
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				freq[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			char currChar = (char) ('a' + i);
			System.out.println("count of " + currChar + " : " + freq[i]);
		}
	}

}
