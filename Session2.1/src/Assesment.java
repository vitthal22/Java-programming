import java.util.Scanner;

public class Assesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = sc.next();
		
		System.out.println("Enter Salary:");
		float salary = sc.nextFloat();
		
		Employee2 e1 = new Employee2(name, salary);
		e1.dispEmp();
		
		///**************
		
		System.out.println("Enter name:");
		String name1 = sc.next();
		
		System.out.println("Enter Salary:");
		float salary1 = sc.nextFloat();
		
		Employee2 e2 = new Employee2(name1, salary1);
		e2.dispEmp();
	}

}

class Employee2
{
	static int i = 101;
	int empid;
	String name;
	float salary;
	
	public Employee2(String name, float salary)
	{
		this.name = name;
		this.salary = salary;
		this.empid = i;
		i++;
	}
	
	public void dispEmp()
	{
		System.out.println("emp id: "+empid+ " emp name: "+name+ " emp salary: "+salary);
	}
}
