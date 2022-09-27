package tuesday27sept;

import java.util.Scanner;
public class SumOfArrayElement {
	
	public static int sumOfElement(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		
		int a[]= new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int res=SumOfArrayElement.sumOfElement(a);
		
		System.out.println(res);

	}

}
