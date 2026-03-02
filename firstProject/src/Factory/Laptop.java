package Factory;

public class Laptop { // SingletonClass
	private static Laptop laptop;
	private Laptop() {
		
	}
	public static Laptop laptopFactory() {
		if(laptop==null) {
			System.out.println("Laptop Object Created");
			laptop = new Laptop();
		}else {
			System.out.println("Laptop already exists");
		}
		return laptop;
	}
}
