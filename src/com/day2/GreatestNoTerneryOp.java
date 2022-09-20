package com.day2;

import java.util.Scanner;

public class GreatestNoTerneryOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter first num");
		int first=sc.nextInt();
		System.out.println("please enter second num");
		int second=sc.nextInt();
		System.out.println("please enter third num");
		int third=sc.nextInt();
		
		int max=(first>second && first>third)?first:(second>first && second>third)?second:third;
		System.out.println(max);
		
		
		
		

	}

}
