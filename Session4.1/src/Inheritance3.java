
public class Inheritance3 {

	public static void main(String[] args) {
		
		//Heirarchial inheritance
		C c = new C();
		c.dowork();
		c.disp();
		
		B b = new B();
		b.dowork();
		b.show();
	}

}

class A
{
	public void dowork()
	{
		System.out.println("doing work");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("showing class of B");
	}
}

class C extends A
{
	public void disp()
	{
		System.out.println("displaing for class C");
	}
}