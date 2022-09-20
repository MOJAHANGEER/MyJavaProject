package com.day2;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter year");
		int year=sc.nextInt();
		if (year%4 == 0){
			System.out.println("This is a leap year");
		}
		else{
			System.out.println("Not a leap year");
		}

	}

}
