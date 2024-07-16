
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		e1.initEmp(101, "Vitthal");
		e1.dispEmp();
//		System.out.println(e1.cname);
		
		Employee1 e2 = new Employee1();
		e2.initEmp(102, "Anju");
		e2.dispEmp();
//		System.out.println(e2.cname);
	}

}

class Employee1
{
	int id;
	String name;
	static String cname = "Dexon"; 
	
	// Static Variable is declared by static keyword which is specify to the class.
	public void initEmp(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void dispEmp()
	{
		System.out.println("Id: "+this.id+" Name "+name+" Compnay name "+cname);
	}
}
