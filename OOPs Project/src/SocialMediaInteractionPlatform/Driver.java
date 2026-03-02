package SocialMediaInteractionPlatform;

public class Driver {

	public static void main(String[] args) {
		Platform instagram = new Platform();
		instagram.addUser(123, "Debkumar");
		instagram.addUser(124,  "jack");
		instagram.follow(123,  124);
	}

}
