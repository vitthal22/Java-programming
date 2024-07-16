package com.MainApp;

import java.util.Stack;

public class Stack_Implement {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);
		s.push("seed");
		s.push('A');
		
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}

}
