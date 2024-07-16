package com.MainApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class comparable_interface {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(105, "dbr", 345);
		Employee e2 = new Employee(102, "bbd", 345);
		Employee e3 = new Employee(104, "dvfd", 345);
		Employee e4 = new Employee(101, "treg", 345);
		Employee e5 = new Employee(103, "fh", 345);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.id<o.id) {
			return 1;
		}
		else if (this.id>o.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}