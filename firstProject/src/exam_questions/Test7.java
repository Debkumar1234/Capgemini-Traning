package exam_questions;

class Test7 {
	int x = 10;

	void change(Test7 t) {
		t = new Test7();
		t.x = 50;
	}

	public static void main(String[] args) {
		Test7 t1 = new Test7();
		t1.change(t1);
		System.out.println(t1.x);
	}
}
