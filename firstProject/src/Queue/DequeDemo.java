package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Object> dq = new ArrayDeque<Object>();
		dq.add(12);
		dq.add(10);
		dq.add(5);
		dq.add(7);
//		dq.add(null);
		System.out.println(dq);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.add(null);
		System.out.println(ll);
		
	}

}
