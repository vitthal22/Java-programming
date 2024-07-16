
public class ConstructorMethodType {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		Demo d1 = new Demo("Say hello");
		d.show();
	}
	
}


class Demo
{
	//Default or Non-parametrized consructor method
	public Demo()
	{
		System.out.println("Demo class default constructor invoked");
	}
	
	//parametrized constructor method
	
	public Demo(String msg)
	{
		System.out.println(msg);
//		System.out.println("Demo class default constructor invoked");
	}
	
	
	//Normal method
	public void show()
	{
		System.out.println("Showing in demo class");
	}
}