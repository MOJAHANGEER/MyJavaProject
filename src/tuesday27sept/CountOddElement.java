package tuesday27sept;

import java.util.Arrays;
import java.util.Scanner;

public class CountOddElement {
	
	public static int countOdd(int []x)
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2!=0)
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		int arr[]= new int[8];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans=CountOddElement.countOdd(arr);
		System.out.println(ans);
		

	}

}
