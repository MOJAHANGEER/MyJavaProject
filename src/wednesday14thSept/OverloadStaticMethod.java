package wednesday14thSept;

public class OverloadStaticMethod {
	
	static int a=10;
	/*static						//this is static block. it is executed before main method.
	{
		System.out.println("hello");
	}*/
	
	public static void addition(int a,int b){
		System.out.println(a+b);
		System.out.println("this is multiplication of these no= "+(a*b));
	}
	public static void addition(String a,int b)
	{
		
		System.out.println(a+b);
	}
	public static void addition(int a,int b,int c)
	{
		
		c=a+b;
		System.out.println("This is assigning value to c="+c);
	}

	public static void main(String[] args) {
		
		OverloadStaticMethod.addition(10,30);
		OverloadStaticMethod.addition(10,30,0);
		OverloadStaticMethod.addition("hello",123);
		System.out.println(a);
		
	}

}
