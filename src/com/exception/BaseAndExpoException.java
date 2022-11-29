package com.exception;

import java.util.Scanner;

class BaseExpoException extends Throwable
{
	BaseExpoException(String str)
	{
		super(str);
	}
}
public class BaseAndExpoException {

	public static void baseExpo(int base,int expo) throws BaseExpoException
	{
		int total=1;
		if(expo<=0)
		{
		   throw new BaseExpoException("Exponent not valid ");
		}
		else
		{
			while(expo!=0)
			{
				total=total*base;
				expo--;
		}
		System.out.println(total);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter exponent");
		int expo=sc.nextInt();
		try{
			baseExpo(base,expo);
		}catch(BaseExpoException e)
		{
			System.out.println(e);
		}
		
		

	}

}
