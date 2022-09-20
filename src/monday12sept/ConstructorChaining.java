package monday12sept;


class Bike
{
	String name;
	int rate;
	String colour;
	int speed;
	String engine;
	
	Bike()
	{
		this("duke", 350000,"orange");
		show();
		if(speed>=150)
		{
			System.out.println("this is enough speed to race");
		}
		else
		{
			System.out.println("choose another");
		}
	
		
	}
	
	Bike(String name,int rate,String colour )
	{
		this(149, "powerful");
		this.name=name;
		this.rate=rate;
		this.colour=colour;
		
	}
	Bike(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
	}
	void show()
	{
		System.out.println(name+" "+rate+" "+engine+" "+speed+" "+colour);
	}
}



public class ConstructorChaining {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		

		
	}

}
