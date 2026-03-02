package com.test;

public class Junit {
	public String rev(String str) {
		String temp = "";
		for(int i = str.length()-1;i>=0;i--) {
			temp += str.charAt(i);
		}
		return temp;
	}
}
