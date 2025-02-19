package com.MainApp;

public class Thread_Syncronization {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		Dheeraj d = new Dheeraj(4000, ac);
		Pranav p = new Pranav(4000, ac);
		
		d.start();
		p.start();

	}

}

class Account{
	int bal=5000;
	
	public /*synchronized*/ void withdraw(int amount) {
		synchronized (this) {
			if(bal>amount) {
				System.out.println("withdraw sucess");
				bal -= amount;
				System.out.println("left bal: "+bal);
			}
			else {
				System.out.println("insuficant balance");
				System.out.println("left bal: "+bal);
			}
		}
	}
}

class Dheeraj extends Thread{
	int am;
	Account ac;
	
	Dheeraj(int am, Account ac) {
		this.am=am;
		this.ac=ac;
	}
	public void run() {
		ac.withdraw(am);
	}
}


class Pranav extends Thread{
	int am;
	Account ac;
	
	Pranav(int am, Account ac) {
		this.am=am;
		this.ac=ac;
	}
	public void run() {
		ac.withdraw(am);
	}
}
