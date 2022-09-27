package wednesday21sept;

class Car
{
	int speed;
	
	public final void setSpeed()
	{
		this.setSpeed("BMW");
		speed=120;
		System.out.println(speed);
		
		
	}
	public final void setSpeed(String name)
	{
		name=name;
		System.out.println(name);
		
		
	}
}
/*class Hundai extends Car
{
	public void setSpeed()
	{
		
	}
}
*/


public class OverloadFinal {

	public static void main(String[] args) {

		Car c=new Car();
		c.setSpeed();
		


	}

}
