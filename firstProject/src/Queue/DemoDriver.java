package Queue;

import java.util.PriorityQueue;

public class DemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		pq.add(5);
//		pq.add(10);
//		pq.add(1);
//		pq.add(4);
//		pq.add(2);
		pq.offer(100);
		pq.offer(50);
		pq.offer(60);
		pq.offer(10);
		pq.offer(70);
		System.out.println(pq);		
		
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
		
	}

}
