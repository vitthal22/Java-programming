
public class ConstructorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Vitthal");
		s1.showStd();
	}

}

class Student
{
	int roll;
	String name;
	
	public Student(int r, String n)
	{
		roll = r;
		name = n;
	}
	
	public void showStd()
	{
		System.out.println("Roll No. is "+roll+" Name is "+name);
	}
}
