package com.exception;

public class NestedTryBlock {

	public static void main(String[] args) {
		
		try{
			try
			{
				int x=10;
				System.out.println(x/0);
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		}catch(ArithmeticException e)
		{
			System.out.println("outer catch block will responsible to  handle exception if inner catch is not handled");
		}

	}

}
