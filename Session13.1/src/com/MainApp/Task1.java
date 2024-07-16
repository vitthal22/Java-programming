package com.MainApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employee = new ArrayList<Employee>();
		while(true) {
			System.out.println("""
					Enter 1 to add
					Enter 2 to read
					Enter 3 to delete
					Enter 4 to update
					Enter 5 to exist
					""");
			int choice = sc.nextInt();
			if (choice ==1) {
				System.out.println("Enter Employee id: ");
				int id = sc.nextInt();
				System.out.println("Enter Employee name: ");
				String name = sc.next();
				System.out.println("Enter Emoloyee Salary: ");
				double salary = sc.nextDouble();
				
				Employee e = new Employee(id, name, salary);
				employee.add(e);
			}
			else if (choice ==2) {
				
			}
			else if (choice==3) {
				
			}
			else if (choice==4) {
				
			}
			else if (choice==5) {
				break;
			}
			else {
				System.out.println("invalid");
			}
		}
		
	}

}

class Validate{
	public String checkId(String id, ArrayList<Employee> employee) {
		for (Employee e : employee) {
			
		}
		return id;
	}
}

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
}