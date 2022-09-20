package wednesday7thsept;

public class Shopping {
	
	int quantity;
	String item;
	double price;
	double total;
	
	public void acceptDetails(int qnty, String itm,double pr)
	{
		quantity=qnty;
		item=itm;
		price=pr;
		
	}
	public void calculateBill()
	{
		if(quantity>0){
			
			total=quantity*price;
			
		}
		else if(quantity<=0)
		{
			System.out.println("Error something");
		}
	}
	public void display()
	{
		System.out.println();
	}

	public static void main(String[] args) {
		
		Shopping sp=new Shopping();
		sp.acceptDetails(0,"Biscuit",10);
		sp.calculateBill();
		sp.display();
		

	}

}
