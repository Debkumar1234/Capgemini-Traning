package exam_questions;

class Test16 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] l = new int[a.length];
		l[0] = 1;
		for (int i = 1; i < a.length; i++)
			l[i] = l[i - 1] * a[i - 1];
		int r = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			l[i] *= r;
			r *= a[i];
		}
		for (int i = 0; i < l.length; i++)
			System.out.print(l[i] + " ");
	}
}
