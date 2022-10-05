package test6;

import java.util.Scanner;

public class EvenOddElement {
	
	public static void evenOdd(int a[])
	{
		int count=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
				//System.out.println("This is even elements ="+a[i]);
			}
			else
			{
				c++;
				//System.out.println("This is odd elements ="+a[i]);
			}
		}
		System.out.println("Even elements ="+count);
		System.out.println("Odd elements ="+c);
	}

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		EvenOddElement.evenOdd(arr);

	}

}
