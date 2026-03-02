package wrapper;

public class Demo {
	static void ParseNumber(String str) {
		int len = str.length();
		int i = 0;
		while(i<len) {
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9') {
				break;
			}
			i++;
		}
		if(i==len) {
			System.out.println("There is no number present inside the string("+str+")");
			return;
		}
		StringBuilder num = new StringBuilder("");
		if(i-1>=0) {
			char temp = str.charAt(i-1);
			if(temp=='+' || temp=='-') {
				num.append(temp);
			}
		}
		char digit = str.charAt(i);
		while(i<len && digit>='0' && digit<='9') {
			num.append(digit);
			if(i+1<len) {
				digit = str.charAt(i+1);
			}
			i++;
		}
		System.out.println("parseByte("+str+") : "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = 7;
//		System.out.println("b : "+b);
//		// wrapping/autoboxing
//		Byte b1 = b;
//		System.out.println("b1 : "+b1);
//		// unwrapping/unboxing
//		byte b2 = b1;
//		System.out.println("b2 : "+b2);
//		
//		String bStr = "7";
//		System.out.println("Type of bStr : "+bStr.getClass());
//		// Parsing using constructor
//		Byte b3 = new Byte(bStr);
//		System.out.println("b3 : "+b3);
//		System.out.println("Type of b3 : "+b3.getClass());
//		// Parsing using parse... method
//		byte b4 = Byte.parseByte(bStr);
//		System.out.println("");
		
		String[] s = {"-1","+1","1","-0","+0","0","1+","1-","++","--","a","a0","a9","++-4","!",""," "};
		for(int i = 0;i<s.length;i++) {
			try {
				byte parseByte = Byte.parseByte(s[i]);
				System.out.println("parseByte("+s[i]+") : "+parseByte);
			} catch (Exception e) {
				ParseNumber(s[i]);
//				System.out.println(e);
			}
		}
		
	}

}
