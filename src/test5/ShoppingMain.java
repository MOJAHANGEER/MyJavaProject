package test5;

class CreditCard
{
	int amount;
	int bill;
	int discount;
	public void discount(int amount)
	{
		this.amount=amount;
		discount = (amount*15)/100;
		bill=amount-discount;
		System.out.println("your total bill after discount is = "+bill);
		
		
	}
}
class DebitCard extends CreditCard
{
	int amt;
	int bill;
	public void discount(int amt)
	{
		this.amt=amt;
		bill= amt;
		System.out.println("this is a bill while you pay by debit card = "+bill);
	}
	
}
class Shopping extends DebitCard
{
	CreditCard cc;
	DebitCard dc;
	public void doTransaction(CreditCard cc)
	{
		
		System.out.println("you got 15% discount on bill on credit card transaction");
		cc.discount(24000);
	}
	public void doTransaction(DebitCard dc)
	{
		System.out.println("no discount on bill on debit card transaction");
		dc.discount(2000);
	}
	
}

public class ShoppingMain {

	public static void main(String[] args) {
	
		CreditCard cc=new CreditCard();
		
		DebitCard dc=new DebitCard();
		
		Shopping sh=new Shopping();
		sh.doTransaction(cc);
		sh.doTransaction(dc);
		

	}

}
