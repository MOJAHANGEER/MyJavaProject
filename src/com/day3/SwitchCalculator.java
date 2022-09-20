package com.day3;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no.");
		int first=sc.nextInt();
		System.out.println("Enter Second no.");
		int second= sc.nextInt();
		System.out.println("+.Addition\n-.Substraction\n*.Multiplication\n/.Division");
		System.out.println("please enter any character for operation");
		char ch=sc.next().charAt(0);
		switch(ch){
		
		case '+': System.out.println("Addition="+(first + second));
				  break;
		case '-': System.out.println("Substraction="+(first - second));
		          break;		  
		case '*': System.out.println("Multiplication="+(first * second));
		          break;		
		case '/': System.out.println("division="+(first / second));
		          break;      
		default: System.out.println("this is invalid case");    
					break;
		}
	}

}
