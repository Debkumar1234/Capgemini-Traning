package firstProject;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Deb";
		String str2 = "Deb";
		String str3 = new String("Deb");
		
//		System.out.println(str3 == (str3 = "Deb"));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
	}

}
