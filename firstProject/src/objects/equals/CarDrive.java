package objects.equals;

public class CarDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("hv", (byte)5);
		Car c2 = new Car("hv", (byte)5);
		Car c3 = c1;
		Car c4 = null;
		
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c4.equals(c1));
	}

}
