package firstProject;

public class Test {

	public static void main(String[] args) { // calling method
		System.out.println("Start of main()");
		m1();// m1 is static method, so if we call it inside that class where it made then this way we can call it otherwise
		Test.m1(); // then className.functionName(); // method call statement
		System.out.println("End of main()");
	}
	public static void m1( ) { // called method
		System.out.println("From m1()");
	}

}
