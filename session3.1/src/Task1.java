import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[10];
		
		/*
		 * add
		 * read
		 * delete
		 * update
		 */
		
		while(true)
		{
			System.out.println("""
					Enter 1 to add
					Enter 2 to read
					Enter 3 to Delete
					Enter 4 to update
					Enter 5 to Exit """);
			
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter number of student ");
				int no = sc.nextInt();
				for(int i=0;i<no;i++) {
					System.out.println("Enter Rollno. ");
					int roll = sc.nextInt();
					System.out.println("Enter name ");
					String name = sc.next();
					System.out.println("Enter percentage ");
					double percentage = sc.nextDouble();
					arr[i] = new Student(roll, name, percentage);
				}
			}
			else if (choice == 2) {
				System.out.println("read");
				for(int i =0;i<arr.length;i++) {
					if(arr[i]!=null) {
						System.out.println("Rollno.: "+arr[i].roll);
						System.out.println("Name: "+arr[i].name);
						System.out.println("Percentage: "+arr[i].percentage);
						System.out.println();
					}
				}	
			}
			else if (choice == 3) {
				System.out.println("Enter roll no. to Delete ");
				int rollTodelete = sc.nextInt();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=null&&arr[i].roll==rollTodelete) {
						arr[i]=null;
						break;
					}
				}
			}
			else if (choice == 4) {
				System.out.println("Enter Rollno. to update ");
				int rollToupdate = sc.nextInt();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=null&&arr[i].roll==rollToupdate) {
						System.out.println("Enter name to update ");
						arr[i].name = sc.next();
						System.out.println("Enter percentage to update ");
						arr[i].percentage = sc.nextDouble();
						break;
					}
				}
			}
			else if (choice == 5) {
				break;
			}
			else {
				System.out.println("invalid");
			}
			
		}

	}

}

class Student
{
	int roll;
	String name;
	double percentage;
	public Student(int roll, String name, double percentage) {
		super();
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	
	
	
	
}