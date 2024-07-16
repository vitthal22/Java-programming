package com.MainApp;

import java.util.Scanner;

public class User_define_exception {

	public static void main(String[] args) {
		System.out.println("first line");
		try {
			Account a = new Account();
			a.login();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("last line");
	}

}

class MyLoginException extends RuntimeException{
	public MyLoginException(String msg) {
		super(msg);
	}
}

class Account{
	Scanner sc = new Scanner(System.in);
	public void login() {
		System.out.println("Enter user name: ");
		String uname = sc.next();
		
		System.out.println("enter password: ");
		String pass = sc.next();
		
		if(!(uname.equals("vitthal")&& pass.equals("Vitthal@123"))) {
			throw new MyLoginException("invalid cresintial");
		} else {
			System.out.println("sucessful login");
		}
	}
}