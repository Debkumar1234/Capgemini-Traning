package exam_questions;

public class Test26 {
	public static void main(String[] args) {
		String s = "a1 b22 c333";
		System.out.println(s.replaceAll("\\w\\d{2}", "X"));
	}
}
