package com.MainApp;

public class Encapulation {

	public static void main(String[] args) {
		
		Users u = new Users();
		
		u.setName("Vitthal");
		u.setPass("vifn233");
		
		System.out.println(u.getName());
		System.out.println(u.getPass());
	}

}

class Users{
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
