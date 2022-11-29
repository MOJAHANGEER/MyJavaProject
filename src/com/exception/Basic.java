package com.exception;

public class Basic {

	public static void main(String[] args) {
		
		System.out.println("Hiii");
		try
		{
			int a=10/0;
			System.out.println(a);
			
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+"Hello");
		}

	}

}
