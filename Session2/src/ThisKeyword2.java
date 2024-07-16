
public class ThisKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
	}

}


class Demo
{
	public Demo()
	{
		this("Say Hello");
		System.out.println("Default const invoked");
	}
	
	public Demo(String msg)
	{
		this(18);
		System.out.println("para const invoked "+msg);
	}
	
	public Demo(int age)
	{
		System.out.println("para const invoked "+age);
	}
}