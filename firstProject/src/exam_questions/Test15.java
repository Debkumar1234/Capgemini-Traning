package exam_questions;

class Test15 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += i;
			}
		}
		System.out.println(arr[2][0]);
	}
}
