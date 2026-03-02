package practiceCode;

import java.util.HashMap;

public class FindDefectiveBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'p', 'p', 'p', 'p', 'f', 'f', 'f', 'f'};
		int left = 0, right = arr.length-1;
		while(left<right) {
			int mid = (left+right)/2;
			if(arr[mid]=='p') {
				left = mid+1;
			}else {
				right = mid;
			}
		}
		System.out.println(left);
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.put(2, 3);
	}

}
