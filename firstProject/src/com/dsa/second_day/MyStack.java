package com.dsa.second_day;

public class MyStack {
	private int top;
	private int capacity;
	private int[] arr;
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		arr = new int[this.capacity];
		top = -1;
	}
	
	public void push(int num) {
		if(top==capacity-1) {
			System.out.println("Stack is already full, can't push");
		}else {
			arr[++top] = num;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			System.out.println("Poped element : "+this.peek());
			return arr[top--];
		}else {
			System.out.println("The stack is empty.");
			return -1;
		}
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println("The stack is empty.");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		System.out.println("Top element : "+stack.peek());
		
	}
	
}
