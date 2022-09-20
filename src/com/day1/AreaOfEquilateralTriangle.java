package com.day1;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides of triangle");
		float sides=sc.nextFloat();
		double con=0.43301270f;
		double area=con*(sides*sides);
		System.out.println("this is your area of equilateral triangle= "+area);
		

	}

}
