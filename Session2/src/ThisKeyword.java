
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.initEmp(101, "Vitthal");
		e1.dispEmp();
		
		Employee e2 = new Employee();
		e2.initEmp(102, "Anju");
		e2.dispEmp();
	}

}

class Employee
{
	int id;
	String name;
	
	//This Keyword id to specify the local and global variable
	public void initEmp(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void dispEmp()
	{
		System.out.println("Id: "+this.id+" Name "+name);
	}
}