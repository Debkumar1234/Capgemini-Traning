package exam_questions;

public class Test1 {
	public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = arr1;
        arr2[0][0] = 10;
        System.out.println(arr1[0][0]);
    }
}
