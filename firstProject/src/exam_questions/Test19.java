package exam_questions;

class Test19 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				count++;
			}
		}
		System.out.print(count);
	}
}
