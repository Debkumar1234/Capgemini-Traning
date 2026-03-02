package com.dsa.third_day;

import java.util.Stack;

public class PrefixEvaluation {
	static String infixToPostfix(String exp) {
		
		return exp;
	}

 	static int evaluatePrefix1(String exp) {
		Stack<Integer> stack = new Stack<>();

		for (int i = exp.length() - 1; i >= 0; i--) {
			char ch = exp.charAt(i);
			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			}

			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int a = stack.pop();
				int b = stack.pop();
				switch (ch) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				}
			}
		}
		return stack.pop();
	}

	static int evaluatePrefix(String exp) {
		Stack<Integer> stack = new Stack<>();

		// scan from right to left
		for (int i = exp.length() - 1; i >= 0; i--) {
			char ch = exp.charAt(i);

			// if operand, push to stack
			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			}
			// if operator
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int a = stack.pop();
				int b = stack.pop();

				switch (ch) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String prefix = "-+9*234"; //
		System.out.println(evaluatePrefix1(prefix)); // Output: 11
	}
}
