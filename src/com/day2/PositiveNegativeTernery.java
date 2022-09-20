package com.day2;

import java.util.Scanner;

public class PositiveNegativeTernery {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		String result;
		
		result=no>0?"positive":no<0?"negative":"zero";
		System.out.println(result);

	}

}
