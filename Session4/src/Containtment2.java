
public class Containtment2 {

	public static void main(String[] args) {

		MyDate joinDate = new MyDate(19, 6, 2344);
		Employee e = new Employee(101, "vitthal", joinDate);
		System.out.println(e);
	}
}

class Employee {
	int id;
	String name;

	MyDate joinDate;
	public Employee(int id, String name, MyDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joinDate=" + joinDate + "]";
	}
}

class MyDate {
	int Day;
	int Month;
	int Year;
	public MyDate(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
	@Override
	public String toString() {
		return "MyDate [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}

}