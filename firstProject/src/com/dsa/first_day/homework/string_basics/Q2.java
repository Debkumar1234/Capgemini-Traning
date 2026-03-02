package com.dsa.first_day.homework.string_basics;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "debkumar";
		int vowel = 0, consonants = 0;
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowel++;
			else consonants++;
		}
		System.out.println("vowel count : "+vowel+", Consonants : "+consonants);
	}

}
