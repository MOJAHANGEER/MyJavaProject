package test3;

//Enter the base and exponent and count the power of that number
import java.util.Scanner;

public class PowerBase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		int result=1;
		
		/*while(expo>0)
		{
			result=result*base;
			expo--;
			
		}
		System.out.println("The result is :"+result);*/
		
		for(int i=1;i<=expo;i++)
		{
			result=result*base;
			
		}
		System.out.println(result);
	}

}
