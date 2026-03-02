package non_premitive_typecasting.upcasting;

public class FamilyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println(p.p);
		p.pm();
		
		Child c = new Child();
		System.out.println(c.c);
		c.cm();
		System.out.println(c.p);
		c.pm();
		
		Child c1 = new Child();
		Parent p1 = c1;   //  'p1' upcasted variable
		System.out.println(c1.c);
		c1.cm();
//		System.out.println(p1.c); // with help of upcasted variable we can only access parent members not child properties
//		p1.cm();
		System.out.println(p1.p);
		p1.pm();
		
//		DownCasting
//		Parent p2 = new Parent();
//		Child c2 = (Child) p2; // Class cast exception
		// To perform downcasting we have to perform upcasting first
		
		Child c3 = new Child();
		Parent upcastedVar = c3;
		Child downCastedVar = 
		
	}

}
