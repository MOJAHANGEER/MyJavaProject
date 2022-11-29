package com.exception;

import java.util.Scanner;

class InvalidBinaryException extends Throwable
{

	public InvalidBinaryException(String s) {
		super(s);
	}
	
}
public class CustomException {
	
	public static void check(int no) throws InvalidBinaryException
	{
	
		boolean isBinary=true;
		
		while(no!=0)
		{
			int r=no%10;
			if(r>1 || r<0)
			{
				isBinary=false;
				break;
			}
			no=no/10;
		}
		if(isBinary==true)
		{
			System.out.println("Valid no");
		}
		else
		{
			throw new InvalidBinaryException("Invalid Exception");
		}
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		int no=sc.nextInt();
		try
		{
			check(no);
		}catch(InvalidBinaryException e)
		{
			System.out.println(e);
		}
		

	}

}
