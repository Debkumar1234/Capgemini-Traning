package firstProject;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Object [] objectArray = {123456989L, "string", '1'};
		boolean[] booleanArray = {true, false, true};
		char[] charArray1 = {'k', 'q', 'g'};
		char[] charArray2 = {'k', 'q', 'g'};
		char[] charArray3 = charArray1;
		
		arrayPrinter(objectArray, booleanArray);
//		arrayPrinter(booleanArray);
//		arrayPrinter(charArray1);
		
//		System.out.println(objectArray);
//		System.out.println(booleanArray);
//		System.out.println(charArray1.hashCode());
//		System.out.println(charArray2.hashCode());
//		System.out.println(charArray3.hashCode());
		
		
		boolean b = true;
		char c = 'k';
		String str = "qwerty";
		
//		singleValuePrinter(b);
//		singleValuePrinter(c);
//		singleValuePrinter(str);
		
		
	}
	
	public static void arrayPrinter(Object... arrays) {
	    for (Object arr : arrays) {
	        if (arr instanceof Object[]) {
	            for (Object o : (Object[]) arr) {
	                System.out.println(o);
	            }
	        } else if (arr instanceof boolean[]) {
	            for (boolean b : (boolean[]) arr) {
	                System.out.println(b);
	            }
	        } else if (arr instanceof char[]) {
	            for (char c : (char[]) arr) {
	                System.out.println(c);
	            }
	        }
	    }
	}

	
//	public static void singleValuePrinter(Object var) {
//		System.out.println(var);
//	}

}
