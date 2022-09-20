package wednesday7thsept;

public class Car {


	private int modelNo;
	private double price;
	private String name;
	private int speed;
	
	public void setModel(int mdl)
	{
		 modelNo=mdl;
		
	}
	public void setPrice(double pr)
	{
		 price=pr;
		
	}
	public void setName(String n)
	{
		name=n;
		
	}
	public void setSpeed(int s)
	{
		 speed=s;
		
	}
	public int getModel()
	{
		return modelNo;
	}
	public double getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.setModel(123);
		c.setName("ODDI");
		c.setPrice(3400000.00);
		c.setSpeed(120);
		
		System.out.println(c.getModel());
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		System.out.println(c.getSpeed());
		

	}

}
