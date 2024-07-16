package com.MainApp;

public class Exception_handling {

	public static void main(String[] args) {
		
		S s = new S();
		s.pop();
		
		
	}

}
//Procedural way of error handling
class S {
	int arr[] = {};
	
	int LastIndex = arr.length-1;
	public void pop() {
		if(LastIndex>=0) {
			System.out.println(arr[LastIndex]);
		}
		else {
			System.out.println("stack is empty");
		}
	}
}
