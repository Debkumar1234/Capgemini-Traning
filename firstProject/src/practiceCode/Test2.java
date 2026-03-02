package practiceCode;

public class Test2 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		Test1 t1 = new Test1();
		System.out.println(t.i);
		t.i = 9;
		System.out.println(t1.i);
	}
}
