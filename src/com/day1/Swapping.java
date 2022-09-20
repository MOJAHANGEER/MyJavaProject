package com.day1;

public class Swapping {

	public static void main(String[] args) {
		int num1=12;
		int num2=24;
		System.out.println("before swapping num1= "+num1 + " & " +"num2 ="+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		 
	/*	int temp=num1;           @@ this is second way to solve this problem.
		num1=num2;
		num2=temp;*/
		System.out.println("after swapping num1= "+num1 + " & " +" num2 ="+num2);
		
		
		
	}

}
