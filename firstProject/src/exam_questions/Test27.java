package exam_questions;

class Test27 {
	static int x = 1;

	static int fun(int n) {
		if (n == 0)
			return 1;
		x++;
		return x * fun(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(fun(2));
	}
}