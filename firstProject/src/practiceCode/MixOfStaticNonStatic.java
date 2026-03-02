package practiceCode;

public class MixOfStaticNonStatic {
//	static var
	static int i;
//	non static var
	int j;
//	static block
	static {
		System.out.println("from static block");
	}
//	non static block
	{
		System.out.println("from non static block");
	}
//	static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from start of main()");
		MixOfStaticNonStatic obj = new MixOfStaticNonStatic();
		System.out.println("from end of main()");
	}
//	non static method
	public void main2() {
		System.out.println("from non static method");
	}
//	constructor
	public MixOfStaticNonStatic() {
		System.out.println("from constructor");
	}
}
