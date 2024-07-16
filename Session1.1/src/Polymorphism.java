
public class Polymorphism {

	public static void main(String[] args) {
		
		//Polymorphism
		Demo d  = new Demo();
		d.add(10.30f, 10);
	}

}


class Demo
{
	//Polymorphism using method overloading
	
	public void add(int n1, int n2)
	{
		System.out.println("add: "+(n1+n2));
	}
	
	public void add(int n1, int n2, int n3)
	{
		System.out.println("add: "+(n1+n2+n3));
	}
	
	public void add(float n1, float n2)
	{
		System.out.println("add: "+(n1+n2));
	}
	
	public void add(float n1, int n2)
	{
		System.out.println("add: "+(n1+n2));
	}
}