package exam_questions;

class Test20 {
	static int x = 5;
	static {
		x += 5;
	}

	Test20() {
		x += 2;
	}

	public static void main(String[] args) {
		Test20 t1 = new Test20();
		Test20 t2 = new Test20();
		System.out.println(x);
	}
}
