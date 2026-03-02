package Lambda;

interface Draw {
	void circle();
}

//class c1 implements Draw{
//
//	@Override
//	public void circle() {
//		// TODO Auto-generated method stub
//		System.out.println("c1 draw");
//	}
//	
//}
//class c2 implements Draw{
//	
//	@Override
//	public void circle() {
//		// TODO Auto-generated method stub
//		System.out.println("c2 draw");
//	}
//	
//}
//class c3 implements Draw{
//	
//	@Override
//	public void circle() {
//		// TODO Auto-generated method stub
//		System.out.println("c3 draw");
//	}
//	
//}

public class Launch {
	public static void main(String[] args) {
		Draw d = () -> {System.out.println("c1 draw");};
		d.circle();
		Draw d2 = () -> {
			System.out.println("c2 draw");
		};
		d2.circle();
	}
}
