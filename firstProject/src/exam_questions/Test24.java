package exam_questions;

class Test24 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 9;
		int l = 0, sum = 0, maxLen = 0;
		for (int r = 0; r < a.length; r++) {
			sum += a[r];
			while (sum > k) {
				sum -= a[l];
				l++;
			}
			if (r - l + 1 > maxLen)
				maxLen = r - l + 1;
		}
		System.out.println(maxLen);
	}
}
