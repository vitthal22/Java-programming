package com.MainApp;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		try {
			Account1 a = new Account1();
			a.withdraw(12000);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class Account1{
	Scanner sc = new Scanner(System.in);
	int accNo;
	String ownerName;
	double balance = 10000.00;
	
	public void withdraw(double amount) {
		System.out.println("enter account number: ");
		this.accNo = sc.nextInt();
		System.out.println("enter name: ");
		this.ownerName = sc.next();
		System.out.println("enter withdraw amount");
		amount = sc.nextDouble();
		
		if (amount >balance) {
			throw new InsufficientBalanceException("enter amount is less than bal");
		} else {
			balance = balance-amount;
			System.out.println("withdraw sucessful");
			System.out.println("left balance : "+balance);
		}
	}
}