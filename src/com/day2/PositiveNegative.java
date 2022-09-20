package com.day2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some no");
		int no=sc.nextInt();
		if (no>0){
			System.out.println("this is positive no");
		}
		else if(no<0){
			System.out.println("this is negative no");
		}
		else{
			System.out.println("this is zero");
		}

	}

}
