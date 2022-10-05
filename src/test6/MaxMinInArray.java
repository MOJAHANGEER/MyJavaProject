package test6;

import java.util.Arrays;

public class MaxMinInArray {

/*	public static void min(int []a)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
	*/
	
/*	public static void max(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	*/
	
	public static void max(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,10,20};
		//MaxMinInArray.min(arr);

		max(arr);
	}

}
