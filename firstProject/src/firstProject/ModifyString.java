package firstProject;

public class ModifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] map = new int[26];
		boolean[] dup = new boolean[26];
		
		StringBuilder sb = new StringBuilder("beautiful");
		for(int i = 0;i<sb.length();i++) {
			map[sb.charAt(i)-'a']++;
		}
		for(int i = 0;i<26;i++) {
			if(map[i]>1) {
				dup[i] = true;
				char ch = (char)('a'+i); 
				System.out.println("Duplicate character : "+ch);
			}
		}
		
		for(int i = sb.length()-1;i>=0;i--) {
			int idx = sb.charAt(i)-'a';
			if(dup[idx] && map[idx]>=1) {
				for(int j = 0;j<map[idx];j++) {
					sb.insert(i, sb.charAt(i));
				}
				map[idx]--;
			}
		}
		System.out.println(sb);
	}

}
// beautiful ==> beauutifuuul;