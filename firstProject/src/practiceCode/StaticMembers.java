package practiceCode;

public class StaticMembers {
	
	static int i = printer();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main()");
		System.out.println("End of main()");
	}
	
	static {
		System.out.println("from static block");
		main(null);
	}
	
	public static int printer() {
		System.out.println("Printed by printer");
//		main(null);
		return 0;
	}

}

//execution order - static members(top to bottom) -> main method

// Output - 
//Printed by printer
//from static block
//Start of main()
//End of main()