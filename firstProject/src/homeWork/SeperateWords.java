package homeWork;

import java.util.ArrayList;

public class SeperateWords {

	public static void main(String[] args) {
        StringBuilder str = new StringBuilder("He is good");
        StringBuilder currStr = new StringBuilder("");
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                arr.add(currStr.toString());
                currStr = new StringBuilder("");
            }else{
                currStr.append(str.charAt(i));
            }
        }
        arr.add(currStr.toString());
        System.out.println(arr);
    }

}
