package practiceCode;

public class Constructor {
	int i = 7;
	
	{
		System.out.println("from non static block{}");
	}

	public void nonStaticMethod() {
		// TODO Auto-generated method stub
		System.out.println("from non static method()");
	}
	
	public Constructor() {
		System.out.println("from constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Start of Main()");
		Constructor demo = new Constructor();
		System.out.println("End of Main()");
	}

}
