
public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(23, "May", 2024);
		Date d2 = new Date(2, "June", 2025);
		
//		d1.initDate();
		System.out.println(d1);
		System.out.println(d2);
		
		//swap date1 with with date2
		
		Date temp = d1;
		d1=d2;
		d2=temp;
		
		System.out.println("after swap");
		System.out.println(d1);
		System.out.println(d2);
	}

}

class Date
{
	int day;
	String month;
	int year;
	
	public Date(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
//	public void initDate()
//	{
//		System.out.println("Date: "+day+"/"+month+"/"+year);
//	}

	
}