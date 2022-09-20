package com.day2;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		int num =sc.nextInt();
		System.out.println("enter second num");
		int num1=sc.nextInt();
		System.out.println("enter third num");
		int num2=sc.nextInt();
		
		if(num>num1){ 
			if(num>num2){
				System.out.println("first num is greater");
			}
			else{
				System.out.println("third no is greater");
				
			}
		}
	
		else if(num1>num){
			if(num1>num2){
				System.out.println("second no is greater");
			}
			else{
				System.out.println("third no is greater");
				
			}
			
		}
		
		else{
			System.out.println("third no is greater");
			
		}

}
}