package homeWork;

public class Reverse {

	public static void main(String[] args) {
        StringBuilder str = new StringBuilder("He is good");
        // str.reverse();
        int l = 0, r = str.length()-1;
        while(l<r){
            char temp = str.charAt(l);
            str.setCharAt(l, str.charAt(r));
            str.setCharAt(r, temp);
            l++;
            r--;
        }
        System.out.println(str);
    }

}
