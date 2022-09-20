package tuesday13sept;

class Calculator
{
	
	public void calculate(float a, float b)
	{
		System.out.println("This is multiplication of no: "+(a*b));
	}
	public void calculate(int a, int b, int c)
	{
		System.out.println("This is the addition  of no: "+(a+b+c));
	}
	public void calculate(double a, float b)
	{
		System.out.println("This is Substraction of no: "+(a-b));
	}
	public void calculate(int a, int b)
	{
		System.out.println("This is division of no: "+(a/b));
	}
	
}
public class ArithmaticOp {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.calculate(100,200, 560);
		c.calculate(4500.69, 4400.57f);
		c.calculate(12.0f, 10.5f);
		c.calculate(120, 5);
	}

}
