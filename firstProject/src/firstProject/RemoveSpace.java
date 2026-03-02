package firstProject;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("   Deb");
//		String trimmedStr = str.toString().trim();
//		System.out.println(trimmedStr);
//		while(str.charAt(0)==' ') {
//			str.deleteCharAt(0);
//		}
//		System.out.println(str);
		String s1 = "aabc a";
		System.out.println(isPalindrome(s1));
	}
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		int i = 0, j = len - 1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
