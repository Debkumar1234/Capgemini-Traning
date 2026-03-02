package firstProject;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen", str2 = "silent";
		if(isAnagram(str1, str2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		char[] s1Arr = s1.toCharArray();
		Arrays.sort(s1Arr);
		char[] s2Arr = s2.toCharArray();
		Arrays.sort(s2Arr);
		for(int i = 0;i< s2Arr.length;i++) {
			if(s1Arr[i] != s2Arr[i]) return false;
		}
		return true;
	}

}
