package enum_experiment;
enum OrderStatus implements A {
	PLACED(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private int code;
	
	OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}
public class B {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.PLACED;
		System.out.println(status);
		System.out.println(status.getCode());
		status.printHello();
	}
}
