package test2;

import java.util.Scanner;

public class TwinPimeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int first=sc.nextInt();
		System.out.println("Enter second no");
		int second=sc.nextInt();
		boolean isPrime1=true;
		boolean isPrime2=true;
		
		for(int i=2;i<first;i++)
		{
			if(first%i==0)
			{
				isPrime1=false;
				break;
			}
		}
		for(int i=2;i<second;i++)
		{
			if(second%i==0)
			{
				isPrime2=false;
				break;
			}
		}
		if(isPrime1==true && isPrime2==true){
			if(first-second==2 || first-second==-2){
				System.out.println("both are twin prime");
			}
			else
			{
				System.out.println("both are not twin prime");
			}
		}
		
		

	}

}
