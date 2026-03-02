package exam_questions;

public class Test22 {
	public static void main(String[] args) {
		String s1 = "1a2b3c";
		String s2 = new String("1a2b3c");
		s1 = s1.replaceAll("\\d", "#");
		s2 = s2.replaceAll("[a-z]", "*");
		System.out.println(s1 + " " + s2);
	}
}
