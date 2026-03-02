package homeWork;

public class RotationalString {
	
	public static boolean isRotation(String s1, String s2) {
		if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length())
            return false;
        
		return (s1+s2).contains(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("abcd", "cdab"));
	}

}
