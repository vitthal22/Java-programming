
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.initEmp(1, "Vitthal", 40000.34);
		e1.dispEmp();
		
		Employee e2 = new Employee();
		e2.initEmp(2, "gupta", 46455.64);
		e2.dispEmp();
		
	}

}

class Employee{
	int EmpId;
	String name;
	double salary;
	
	public void initEmp(int i, String n, double s)
	{
		EmpId = i;
		name = n;
		salary = s;
	}
	//access
	public void dispEmp()
	{
		System.out.println("Employee id is "+EmpId);
		System.out.println("Employee name is "+name);
		System.out.println("Employee salary is "+salary);
	}
}