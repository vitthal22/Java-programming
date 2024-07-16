
public class Inheritance {

	public static void main(String[] args) {
		
		// Single Level Inheritance
		Developer d = new Developer();
		d.setId(101);
		d.setName("Vitthal");
		d.setSalary(10000);
		d.setProject("JEE");
		d.setTech("Enginer");
		
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getProject());
		System.out.println(d.getTech());
	}
}

class Employee{
	int id;
	String name;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Developer extends Employee{
	String tech;
	String project;
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
}