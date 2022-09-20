package monday19thSept;

class Mobile
{
	int price ;
	String name;
}
class Samsung extends Mobile
{
    void show_details()
    {
    	price = 2000;
    	name="Samsung s11";
    	System.out.println("This is price of  mobile = "+price+ " and  name of model is = "+name);
    	
    }
}
class Vivo extends Mobile
{
	void show_deails()
	{
		price = 14000;
		name = "vivo v19";
		System.out.println("This is price of mobile = "+price + " and model name is = "+name);
		
	}
}

public class Multilevel3 {

	public static void main(String[] args) {
		
		Samsung sam=new Samsung();
		sam.show_details();
		
		Vivo v=new Vivo();
		v.show_deails();

	}

}
