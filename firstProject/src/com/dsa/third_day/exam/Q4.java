package com.dsa.third_day.exam;

public class Q4 {
	public static boolean PatternExists(String str, String pattern) {
		int n = str.length();
		int m = pattern.length();
		for(int i = 0;i<=(n-m);i++) {
			int j = 0;
			while(j<m && str.charAt(i+j)==pattern.charAt(j)) {
				j++;
			}
			if(j==m) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(PatternExists("debkumar", "deb"));
	}
}
