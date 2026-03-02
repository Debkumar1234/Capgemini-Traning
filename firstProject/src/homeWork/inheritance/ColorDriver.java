package homeWork.inheritance;

public class ColorDriver {

	public static void main(String[] args) {
//		Blue parent1 = new Green();
//		Blue parent2 = new Red();
//		Green green = (Green)parent1; // DownCasting
//		Red red = (Red)parent2; //DownCasting
//		Blue blue1 = new Green();
//		Blue blue2 = new Red();
//		blue1.BlueMethod();
//		blue2.BlueMethod();
		Red red = new Red();
		Green green = new Green();
		Blue.a = 30;
		System.out.println(green.a);
	}

}
