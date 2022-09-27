package thursday22sept;

abstract class Ac
{
	abstract void coolness();

	Ac(int price)
	{
		System.out.println("price is = "+price);
	}
	
	void show()
	{
		System.out.println("cooling....");
	}
}
class Panasonic extends Ac
{
	Panasonic()
	{
		super(40000);
	}
	void coolness()
	{
		System.out.println("Cooling is work of ac");
	}
}


public class TestAbstractClass {

	public static void main(String[] args) {
		
		Ac pc=new Panasonic();
		pc.coolness();
		pc.show();
		

	}

}
