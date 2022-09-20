package monday19thSept;


class Laptop
{
	int price;
	
}
class Dell extends Laptop
{
	void show()
	{
		price = 51000;
		System.out.println("This is price of dell laptop : "+price);
	}
}
class HP extends Laptop
{
	void show()
	{
		price = 45000;
		System.out.println("This is a hp laptop price : "+price);
	}
	
}
public class Multilevel1 {

	public static void main(String[] args) {
		
		Dell d=new Dell();
		d.show();
		
		HP hp=new HP();
		hp.show();
		
		

	}

}
