
public class setandgetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =  new Employee();
		e1.setId(101);
		e1.setName("Vitthal");
		e1.setSalary(54456.544);
		
		System.out.println("Id "+e1.getId());
		System.out.println("Name "+e1.getName());
		System.out.println("Salary "+e1.getSalary());
	}

}

class Employee
{
	int id;
	String name;
	double salary;
	
	//Setter/mutator Method
	public void setId(int i)
	{
		id=i;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setSalary(double s)
	{
		salary = s;
	}
	
	//Getter/Accessor Method
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
}
