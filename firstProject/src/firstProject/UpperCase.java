package firstProject;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("b@AS*");
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32);
				str.replace(i, i+1,""+ch);
			}else if(ch>='A' && ch<='Z') {
				ch = (char)(ch+32);
				str.replace(i, i+1,""+ch);
			}
		}
		System.out.println(str);
		
	}

}
