package com.MainApp;

public class Finally {

	public static void main(String[] args) {
		
		try {
			//open file
			System.out.println("file open");
			System.out.println("start operation");
			String s = null;
			s.toLowerCase();
		} 
		catch (Exception e) {
			System.out.println("error occoured");
		}
		finally {
			System.out.println("file closed");
		}
	}
}
