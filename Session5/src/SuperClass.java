
public class SuperClass {

	public static void main(String[] args) {
		
		B b = new B();

	}

}

class A
{
	int age = 20;
	public void show() {
		System.out.println("showing");
	}
	
	public A() {
		System.out.println("default cons of A class");
	}
}

class B extends A{
	public B() {
		//accessiong cons
		super();
		//accessing data member
		System.out.println(super.age);
		//accessing method
		super.show();
		System.out.println("con of B class");
	}
}