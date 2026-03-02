package firstProject;

public class ColumnMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] arr = {
//				{1},
//				{2,7},
//				{3}
//		};

//		int[][] arr = null;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].length != 1) {
//				System.out.println("MAtrix is not a column matrix");
//				return;
//			}
//		}

//		System.out.println("Matrix is a column matrix");
		
		int [][] mat = {
				{1,4,7},
				{2,0,8},
				{3,6,9}
		};
		System.out.println("Before Modification : ");
		printMatrix(mat);
		
		int xCor = mat.length;
		int yCor = mat[0].length;
		
		int[] x = new int[xCor];
		int[] y = new int[yCor];
		for(int i = 0;i<xCor;i++) {
			for(int j = 0;j<yCor;j++) {
				if(mat[i][j]==0) {
					x[i] = 1;
					y[j] = 1;
				}
			}
		}
		for(int i = 0;i<xCor;i++) {
			if(x[i]==1) {
				for(int j = 0;j<yCor;j++) {
					mat[i][j] = 0;
				}
			}
		}
		for(int i = 0;i<yCor;i++) {
			if(y[i]==1) {
				for(int j = 0;j<xCor;j++) {
					mat[j][i] = 0;
				}
			}
		}
		System.out.println("After Modification : ");
		printMatrix(mat);
		
	}
	
	public static void printMatrix(int [][] arr) {
		int n = arr.length, m = arr[0].length;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
