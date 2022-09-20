package com.day2;

import java.util.Scanner;

public class divisibleOrNot {

	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter some no. =");
		int a=sc.nextInt();
		if (a%5 == 0){
			
			if (a%11 == 0){
				System.out.println("this is also devided by 11");
			}
			else{
				System.out.println("this is completely divided by 5 but not 11");
			}
			
		}
		else{
			System.out.println("this is not devisible by 5 and 11");
		}

	}

}
