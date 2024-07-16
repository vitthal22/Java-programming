package com.MainApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "abc", 10000);
		Employee e2 = new Employee(103, "efg", 20000);
		Employee e3 = new Employee(104, "lmn", 30000);
		Employee e4 = new Employee(105, "pqr", 40000);
		Employee e5 = new Employee(102, "xyz", 50000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		List<Employee> l = al.stream()
		.filter(x->x.getSalary()<40000)
		.map(x-> new Employee(x.getId(), x.getName(),x.getSalary()+1000))
		.sorted(Comparator.comparing(Employee::getId))
		.collect(Collectors.toList());
		
//		System.out.println(l);
		l.forEach(System.out::println);
		
	}

}

class Employee
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
