package homeWork;

public class MatrixIdentification {

	public static void main(String[] args) {
		int [][] mat = {
				null
		};
		
		if(!isValidMatrix(mat)) {
			System.out.println("It is not a valid matrix");
			return;
		}
		
		if(isSingleton(mat)) {
			System.out.println("It is a Singleton Matrix");
		}else if(isNullMatrix(mat)){
			System.out.println("It is a Null Matrix");
		}else if(isColumnMatrix(mat)){
			System.out.println("It is a Column Matrix");
		}else if(isDiagonalMatrix(mat)){
			System.out.println("It is a Diagonal Matrix");
		}else if(isHorizontalMatrix(mat)){
			System.out.println("It is a Horizontal Matrix");
		}else if(isIdentityMatrix(mat)){
			System.out.println("It is a Identity Matrix");
		}else if(isRectangularMatrix(mat)){
			System.out.println("It is a Rectangular Matrix");
		}else if(isSquareMatrix(mat)){
			System.out.println("It is a Square Matrix");
		}else { 
			System.out.println("It is a random Matrix");
		}
	}
	
	public static boolean isValidMatrix(int[][] mat) {
		if(mat.length<1) return false;
		int len;
		if(mat[0]!=null) len = mat[0].length;
		else return false;
		
		for(int i = 0;i<mat.length;i++) {
			if(mat[i]==null || mat[i].length!=len) return false;
		}
		return true;
	}
	public static boolean isSingleton(int[][] mat) {
		if(mat.length==1 &&  mat[0]!=null && mat[0].length==1) return true;
		return false;
	}
	public static boolean isRowMatrix(int[][] mat) {
		if(mat.length==1 &&  mat[0]!=null) return true;
		return false;
	}
	public static boolean isColumnMatrix(int[][] mat) {
		for(int i = 0;i<mat.length;i++) {
			if(mat[i]!=null && mat[i].length!=1) {
				return false;
			}
		}
		return true;
	}
	public static boolean isNullMatrix(int[][] mat) {
		int count = 0;
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat[0].length;j++) {
				if(mat[i][j]!=0) {
					return false;
				}
				count++;
			}
		}
		return (count>0)?true:false;
	}
	
	public static boolean isHorizontalMatrix(int[][] mat) {
		if(mat.length<mat[0].length) return true;
		return false;
	}
	public static boolean isSquareMatrix(int[][] mat) {
		if(mat.length==mat[0].length) return true;
		return false;
	}
	public static boolean isRectangularMatrix(int[][] mat) {
		if(mat.length!=mat[0].length) return true;
		return false;
	}
	public static boolean isIdentityMatrix(int[][] mat) {
		if(!isSquareMatrix(mat) && !isDiagonalMatrix(mat)) return false;
		for(int i = 0;i<mat.length;i++) {
			if(mat[i][i]!=1) return false;
		}
		return true;
	}
	public static boolean isDiagonalMatrix(int[][] mat) {
		if(!isSquareMatrix(mat)) return false;
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat[0].length;j++) {
				if(i!=j && mat[i][j]!=0) return false;
			}
		}
		return true;
	}
	
	
	
	
	
}
