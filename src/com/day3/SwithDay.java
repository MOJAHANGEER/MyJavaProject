package com.day3;

import java.util.Scanner;

public class SwithDay {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter day of no.");
		int day=sc.nextInt();
		switch (day){
		
		
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;	
		default:
			System.out.println("oops !! what are you doing");
			break;	
			
		}

	}

}
