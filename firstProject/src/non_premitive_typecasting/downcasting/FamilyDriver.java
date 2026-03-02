package non_premitive_typecasting.downcasting;

public class FamilyDriver {

	public static void main(String[] args) {
//		DownCasting
//		Parent p2 = new Parent();
//		Child c2 = (Child) p2; // Class cast exception
		// To perform downcasting we have to perform upcasting first
		
		System.out.println("Start");
		Child c3 = new Child();
		System.out.println(c3);
		Parent upcastedParentVar = c3;
		System.out.println(upcastedParentVar);
		Child downCastedChildVar = (Child)upcastedParentVar;
		Child2 downCastedChild2Var = (Child2)upcastedParentVar;
		System.out.println(downCastedChildVar);
		System.out.println(downCastedChildVar.c);
		System.out.println(downCastedChildVar.p);
		downCastedChildVar.pm();
		downCastedChildVar.cm();
		System.out.println("End");
	}

}
