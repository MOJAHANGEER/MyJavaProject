package wednesday14thSept;

public class OverLoadMainMethod {

	
	public static void main(char a,char b)
	{
		System.out.println("this is user created main method= "+(a+""+b));
	}
	public static void main(int x,int y,int z)
	{
		
		int multi=x*y*z;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		
		OverLoadMainMethod.main('o','k');
		OverLoadMainMethod.main(17, 10, 5);

	}

}
