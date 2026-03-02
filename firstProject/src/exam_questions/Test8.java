package exam_questions;

class Test8 {
	public static void main(String[] args) {
		String s = "aaabbcccdeee";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				count++;
			else {
				sb.append(s.charAt(i - 1));
				if (count > 1)
					sb.append(count);
				count = 1;
			}
		}
		sb.append(s.charAt(s.length() - 1));
		if (count > 1)
			sb.append(count);
		String t = sb.toString().replaceAll("[aeiou]", "*");
		StringBuilder res = new StringBuilder(t).reverse();
		System.out.println(res);
		String s1 = "abcXYZ123";
		System.out.println(s1.replaceAll("[a-z]", "X"));
	}
}
