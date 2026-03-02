package Exception.checked_exception;

enum Permit {
	SOFT, HARD
}

public class CustomCheckedExceptionDemo {
//	public static Permit validateAge(int age) throws InvalidAgeException {
		public static Permit validateAge(int age) throws InvalidAgeException, RandomException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older to register.");
		}else if(age>=18 && age<21) {
			throw new RandomException("Random Exception");
//			return Permit.SOFT;
		}
		return Permit.HARD;
	}
	
	public static void main(String[] args) {
			try {
				Permit message = validateAge(16);
				System.out.println("You are allowed for : "+message+" alcohol");
				System.out.println("Proceed to registration.");
			} catch (InvalidAgeException | RandomException e) {
				System.out.println("Caught Exception : "+e.getMessage());
			}
	}

}
