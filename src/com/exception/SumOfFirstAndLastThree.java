package com.exception;

import java.util.Scanner;

class NotEqualException extends Exception
{
	NotEqualException(String str)
	{
		super(str);
	}
}


public class SumOfFirstAndLastThree {

	static void notequal(String st) throws NotEqualException
	{
		int sum=0;
		int sum1=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<3;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				int a=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+a;
			}
		}
		for(int i=ch.length-1;i>ch.length-4;i--)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				int b=Integer.parseInt(String.valueOf(ch[i]));
				sum1=sum1+b;
			}
		}
		if(sum==sum1)
		{
			System.out.println("both are same");
		}
		else
		{
			throw new NotEqualException("Both are not same");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		try
		{
			SumOfFirstAndLastThree.notequal(str);
		}catch(NotEqualException e)
		{
			System.out.println(e);
		}
		

	}

}
