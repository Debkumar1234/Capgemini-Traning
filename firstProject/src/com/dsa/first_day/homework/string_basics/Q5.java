package com.dsa.first_day.homework.string_basics;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Debkumar Mallick";
		int diff = 'D'-'d';
		System.out.println(diff);
		char[] charArr = str.toCharArray();
		int len = str.length();
		for(int i = 0;i<len;i++) {
			if(charArr[i]>='A' && charArr[i]<='Z') {
				charArr[i] = (char)(charArr[i]+32);
			}else if(charArr[i]>='a' && charArr[i]<='z'){
				charArr[i] = (char)(charArr[i]-32);
			}
		}
		str = new String(charArr);
		System.out.println("After convert upper to lower and lower to upper : "+str);
	}

}
