package com.day3;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int no=sc.nextInt();
		int res=(no%2);
		switch(res){
		
		case 1: 
			System.out.println("this is even");
		     break;
		default: System.out.println("this is odd");
		break;
	
		
		}

	}

}
