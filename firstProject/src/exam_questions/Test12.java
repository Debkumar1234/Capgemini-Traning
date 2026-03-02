package exam_questions;

class Test12 {
	static int x = 2;
	int y = 3;

	Test12() {
		x++;
		y++;
	}

	void show() {
		System.out.print(x + y);
	}

	public static void main(String[] args) {
		Test12 s1 = new Test12();
		Test12 s2 = new Test12();
		s1.show();
		s2.show();
	}
}
