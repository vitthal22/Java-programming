package com.MainApp;

public class finalReThrow {

	public static void main(String[] args) {
		//final re throw
		
		try {
			System.out.println("file open");
			try {
				System.out.println("operation start");
			} 
			catch (Exception e) {
				System.out.println("error occured");
			}
			
			System.out.println("file close");
		} 
		catch (Exception e) {
			System.out.println("error");
		}
	}

}
