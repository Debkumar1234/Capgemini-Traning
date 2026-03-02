package firstProject;

public class CalculatorUsingVarArgs {
	public static void main(String[] args) {
		
	}
	
	public static int sum(int... num) {
		int sum = 0;
		for(int n : num) {
			sum += n;
		}
		return sum;
	}
}
