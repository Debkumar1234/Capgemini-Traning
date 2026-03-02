package exam_questions;

public class Test17 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Ja" + "va";
		String s3 = new String("Java");
		String s4 = "Ja";
		String s5 = s4 + "va";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s5);
		System.out.println(s1.equals(s5));
	}
}