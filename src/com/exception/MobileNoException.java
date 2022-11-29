package com.exception;

import java.util.Scanner;

class InvalidMoNoException extends Throwable
{
	InvalidMoNoException(String str)
	{
		super(str);
	}
}
public class MobileNoException {
	
	public static void invalidMoNoException(long no) throws InvalidMoNoException
	{
		int count=0;
	    long temp=no;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
			
		}
		if(count==10 && no>1)
		{
			System.out.println("This is valid number");
		}
		else
		{
			throw new InvalidMoNoException("your mobile no is not valid");
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		long no=sc.nextLong();
		try
		{
		MobileNoException.invalidMoNoException(no);
		}catch(InvalidMoNoException e)
		{
			System.out.println(e);
		}

	}

}
