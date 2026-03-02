package exam_questions;

class Test13 {
	static int[] arr = { 1, 2, 3 };

	static void update(int[] a) {
		a[0] += 5;
		arr[1] += 10;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30 };
		update(nums);
		System.out.print(nums[0] + " " + nums[1] + " " + arr[1]);
	}
}
