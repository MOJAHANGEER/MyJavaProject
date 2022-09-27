package wednesday21sept;

class Bank
{
	String name;
	public static void setName()
	{
		System.out.println("this is name ");
	}
}
class SBI extends Bank

{
	
	
	public static void setName()
	{
		
		System.out.println("This is a interestRate ");
	}
}

public class OverrideStaticMeth {

	public static void main(String[] args) {
		
		Bank.setName();
		SBI.setName();

	}

}
