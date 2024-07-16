package Basic;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		// object  creation using 'new' keyword
		
		Demo ob1 = new Demo();
		ob1.show();
		
		Demo ob2 = new Demo(); // object create at the runtime
	}
}

class Demo{
	public void show()
	{
		System.out.println("showing in demo class show method");
	}
}

