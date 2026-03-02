package com.dsa.second_day;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	void push(int x) {
		q2.add(x);
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	int pop() {
		return q1.isEmpty() ? -1 : q1.remove();
	}

}
