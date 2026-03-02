package firstProject;import java.util.Scanner;


public class TwoDMatrics {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[0][1];
//		System.out.println(arr);
		int [][] arr2 = {{1,2,3,4},{1,2,3}};
//		arr2[1][3] = 2;
		
//		System.out.println(countNum(arr2));
		int[][] arr3 = takeInput();
		countNum(arr3);
		
	}
	
	public static int [][] takeInput() {
		int n, m;
		
		System.out.print("Enter the number of row : ");
		n = sc.nextInt();
		System.out.print("Enter the number of column : ");
		m = sc.nextInt();
		int [][] arr = new int[n][m];
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.printf("Enter the number at [%d,%d] : ",i,j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
		
	}
	
	public static int countNum(int [][] arr) {
		int n = arr.length, m = arr[0].length;
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		return count;
	}

}
