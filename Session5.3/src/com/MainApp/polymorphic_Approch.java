package com.MainApp;

public class polymorphic_Approch {

	public static void main(String[] args) {
		
		//non polymorphic Approch
//		BMW b = new BMW();
//		b.color();
//		b.speed();
//		b.price();
//		
//		Audi a = new Audi();
//		a.color();
//		a.speed();
//		a.price();
//		
//		Creta c = new Creta();
//		c.color();
//		c.speed();
//		c.price();
		
		//polymorphic approch
		BMW b = new BMW();
		Audi a = new Audi();
		Creta c = new Creta();
		
		Permission p = new Permission();
		p.permit(b);
		p.permit(a);
		p.permit(c);
		
	}

}

class Car {
	public void speed() {
		
	}
	public void color() {
		
	}
	public void price() {
		
	}
}

class BMW extends Car{
	public void speed() {
		System.out.println("240km");
	}
	public void color() {
		System.out.println("black");
	}
	public void price() {
		System.out.println("55lakh");
	}
}

class Audi extends Car{
	public void speed() {
		System.out.println("200km");
	}
	public void color() {
		System.out.println("Megenta");
	}
	public void price() {
		System.out.println("49lakh");
	}
}

class Creta extends Car{
	public void speed() {
		System.out.println("180km");
	}
	public void color() {
		System.out.println("Blue");
	}
	public void price() {
		System.out.println("18lakh");
	}
}

class Permission{
	public void permit(Car c) {
		c.speed();
		c.color();
		c.price();
	}
}