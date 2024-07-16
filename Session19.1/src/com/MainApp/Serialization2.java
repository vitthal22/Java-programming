package com.MainApp;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 {

	public static void main(String[] args) throws IOException, Exception {
		
		
//		Employee1 e = new Employee1(101, "vithal", 100000);

		
//		String path = "C:\\Users\\vitth\\Desktop\\data.txt";
//		FileOutputStream fos = new FileOutputStream(path);
//		
//		ObjectOutputStream oos  = new ObjectOutputStream(fos);
//		oos.writeObject(e);
//		System.out.println("done");
	
		
		
		
		String path1 = "C:\\Users\\vitth\\Desktop\\data.txt";
		FileInputStream fis = new FileInputStream(path1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee1 e1 = (Employee1)ois.readObject();
		System.out.println(e1);
		

		
	}

}

class Employee1 implements Externalizable{
//	 private static final long serialVersionUID = -5015373072222927599L;
	int id;
	String name;
	double salary;
	
	public Employee1() {}
	public Employee1(int id, String name, double salary) {
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
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeDouble(salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = (String) in.readObject();
		this.salary = in.readDouble();
	}
	
	
}