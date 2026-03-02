package objects;

public class UserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User man = new User("abc@gmail.com","1234");
		System.out.println(man.email);
		System.out.println(man.password);
		User man1 = new User("abcd@gmail.com","12345", "Kolkata");
		System.out.println(man1.email + " " + man1.password + " " + man1.address);
	}

}
