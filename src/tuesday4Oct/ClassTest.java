package tuesday4Oct;

import java.util.Scanner;

public class ClassTest {

	public static void checkPrime(int no)
	{
		while(no>0)
		{
		        int r=no%10;
		        
				boolean isPrime=true;
				for(int i=2;i<r;i++)
				{
					if(r%i==0)
					{
						
						isPrime=false;
						break;
					}
				}
				if(isPrime==true)
				{
					System.out.println("prime no"+r);
				}
				else
				{
					System.out.println(r+"not");
				}
				no=no/10;
			}
		}
			
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		ClassTest.checkPrime(no);
	
	
		
		
	
	}
}

