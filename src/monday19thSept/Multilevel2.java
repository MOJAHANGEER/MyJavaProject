package monday19thSept;

class TelecomCompany
{
	String name;
}
class Airtel extends TelecomCompany
{
	void disply()
	{
		name="Airtel";
		System.out.println(name);
		
		
	}
}
class Jio extends TelecomCompany
{
	void display()
	{
		name="jio";
		System.out.println(name);
	}
}
public class Multilevel2 {

	public static void main(String[] args) {
		
		Airtel air=new Airtel();
		air.disply();
		
		Jio j=new Jio();
		j.display();

	}

}
