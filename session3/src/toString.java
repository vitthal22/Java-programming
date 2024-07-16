
public class toString {

	public static void main(String[] args) {
		//toString method
		Employee e1 = new Employee();
		e1.setId(11);
		e1.setName("vitthal");
		
		//System.out.println(e1);
		
		Temp t = new Temp();
		int x=10;
		t.show(x);
		
		t.show1(e1);
	}

}



class Employee
{
	int id;
	String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Employee id = " + id + ",name = " + name ;
	}
	
	//alt+shift+s
}

class Temp
{
	public void show(int a)
	{
		System.out.println(a);
	}
	public void show1(Employee a)
	{
		System.out.println(a);
	}
}