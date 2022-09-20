package com.day2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some value");
		int value =sc.nextInt();
		if (value%2 == 0){
			System.out.println("this is even no.");
		}
		else{
			System.out.println("this is odd no");
		}

	}

}
