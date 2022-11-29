package com.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("IF you can handle your exception then rest of code will get executed");
		}
		finally
		{
			System.out.println("Finally block is always executed either your exception is handled or not");
		}

	}

}
