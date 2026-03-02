package firstProject;

public class EmailValidation {
    static String email = "kp.at.workplace@gmail.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isEmailValid(email)) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
	}
	
	
	public static boolean isEmailValid(String email) {
		if(!(email.contains("@"))) {
			return false;
		}
		return true;
	}

}
