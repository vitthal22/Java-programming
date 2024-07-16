package com.MainApp;

import java.util.ArrayList;

public class StackMain {

	public static void main(String[] args) {
		

		
		MyStack<Integer> ob1 = new MyStack<>();
		ob1.Push(1);
		ob1.Push(2);
		ob1.Push(3);
		System.out.println(ob1.Pop());
		System.out.println(ob1.Pop());
		System.out.println(ob1.Pop());
		
		MyStack<String> ob2 = new MyStack<>();
		ob2.Push("abc");
		ob2.Push("xyz");
		ob2.Push("def");
		System.out.println(ob2.Pop());
		System.out.println(ob2.Pop());
		System.out.println(ob2.Pop());
		
	}

}

class MyStack<T>{
	T a;


	
	ArrayList<T> al = new ArrayList<T>();
	public void Push(T element) {
		al.add(element);
	}
	public T Pop() {
		if(al.isEmpty()) {
			return null;
		}
		T res = al.remove(al.size()-1);
		return res;
	}
}