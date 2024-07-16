package com.MainApp;

public class Deep_Clone {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		//Deep Clone
		
		Student s1 = new Student();
		s1.setRoll(11);
		s1.setName("vitthal");
		
		Student s2 = (Student)s1.clone();
		
		s1.setName("xya");
		
		System.out.println(s2.getName());
		

	}

}

class Student implements Cloneable{
	int Roll;
	String name;
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

