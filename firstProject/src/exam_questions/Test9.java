package exam_questions;

class Test9 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2 };
		arr[1] = new int[] { 3, 4, 5 };
		arr[2] = new int[] { 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				if (arr[i].length > 2)
					sum += 1;
			}
		}
		System.out.println(sum);
	}
}
