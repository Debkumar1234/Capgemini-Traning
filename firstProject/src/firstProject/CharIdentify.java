package firstProject;

public class CharIdentify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		if(ch >= 'A' && ch <='Z') {
			System.out.println("It is uppercase");
		}else if(ch >= 'a' && ch <='z') {
			System.out.println("It is lowercase");
		}else if(ch>='0' && ch<='9') {
			System.out.println("It is a digit");
		}else {
			System.out.println("It is a speacial character");
		}
	}

}
