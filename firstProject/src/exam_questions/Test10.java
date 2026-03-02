package exam_questions;

public class Test10 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		for (int i : arr)
			i += 5;
		for (int i : arr)
			System.out.print(i + " ");
	}
}
