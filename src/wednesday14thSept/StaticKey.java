package wednesday14thSept;

public class StaticKey {

	/*int x=10;
	 static int x=10;
	 StaticKey()
	 {
		 x++;
		 System.out.println(x);
	 }
	*/
	
	
	static int x=10;
	int y=20;
	public void display()
	{
		
		System.out.println(x+" "+y);   //we can able to access both static and non-statc member  inside of non-static method
	}
	
	public static void show()
	{
		System.out.println(x);  //we dont access non static member inside of static method directly;
		
		
	     StaticKey st=new StaticKey(); 
		System.out.println(st.y);  //static block is execute only one time;
		
	}
	public static void main(String[] args) {
		
	  /*  System.out.println(x);
		StaticKey st=new StaticKey();
		StaticKey st1=new StaticKey();*/
		
		StaticKey st2=new StaticKey();  
		st2.display();
		//st2.displayY(3);
		
		

	}

}
