package exam_questions;

class Test18 {
	public static void main(String[] args) {

		String s = "aaabbbcccdddeee";
		StringBuilder sb = new StringBuilder();
		int count = 1;

		// Build compressed string (character + count)
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				sb.append(s.charAt(i - 1));
				if (count > 1) {
					sb.append(count);
				}
				count = 1;
			}
		}

		// Append last character and its count
		sb.append(s.charAt(s.length() - 1));
		if (count > 1) {
			sb.append(count);
		}

		// Reverse every alternate block of letters (letter + count)
		StringBuilder res = new StringBuilder();
		int i = 0;

		while (i < sb.length()) {
			StringBuilder temp = new StringBuilder();

			temp.append(sb.charAt(i));
			i++;

			if (i < sb.length() && Character.isDigit(sb.charAt(i))) {
				temp.append(sb.charAt(i));
				i++;
			}

			if ((res.length() / 2) % 2 == 0) {
				int l = 0;
				int r = temp.length() - 1;

				while (l < r) {
					char t = temp.charAt(l);
					temp.setCharAt(l, temp.charAt(r));
					temp.setCharAt(r, t);
					l++;
					r--;
				}
			}

			res.append(temp);
		}

		System.out.println(res);
	}
}
