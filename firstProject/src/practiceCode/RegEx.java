package practiceCode;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345ab@";
		String email = "deb65.mal65@gmail.com";
		System.out.println(s.matches("\\d+.+"));
		System.out.println(email.matches("^[a-zA-Z0-9._+%-]+@gmail\\.com$"));
	}

}
