public class Containtment {

	public static void main(String[] args) {
		car c = new car();
		c.setBrand("Alto");
		c.setColor("Black");
		c.setPrice(600000);
		
		Engine e = new Engine();
		e.setRpm("1233rpm");
		e.setToruqe("199mpm");
		e.setFuelType("Petrol");
		
		c.setE(e);
		
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		System.out.println(c.getE().getFuelType());
		System.out.println(c.getE().getRpm());
		System.out.println(c.getE().getToruqe());
	}
}

class car{
	String Color;
	String Brand;
	int price;
	
	Engine e;

	public void setColor(String color) {
		Color = color;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String getColor() {
		return Color;
	}
	public String getBrand() {
		return Brand;
	}
	public int getPrice() {
		return price;
	}
	public Engine getE() {
		return e;
	}
}

class Engine{
	String Rpm;
	String Toruqe;
	String fuelType;
	public void setRpm(String rpm) {
		Rpm = rpm;
	}
	public void setToruqe(String toruqe) {
		Toruqe = toruqe;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getRpm() {
		return Rpm;
	}
	public String getToruqe() {
		return Toruqe;
	}
	public String getFuelType() {
		return fuelType;
	}
}