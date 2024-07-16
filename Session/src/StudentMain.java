
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.initStudent(1, "Vitthal", 74.8);
		st.printDetails();
		
		Student st1 = new Student();
		st1.initStudent(2, "Anju", 56.7);
		st1.printDetails();
	}

}

class Student
{
	int rollno;
	String name;
	double percentage;
	
	public void initStudent(int r, String n, double p)
	{
		rollno = r;
		name = n;
		percentage = p;
	}
	
	public void printDetails()
	{
		System.out.println("Roll no. of student is "+rollno);
		System.out.println("Name of student is "+name);
		System.out.println("Percentage of student is "+percentage);
	}
}
