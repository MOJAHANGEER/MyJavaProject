package com.day1;

import java.util.Scanner;

public class SigleDoubleOrThree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		if((num>=0 && num<=9  )||( num<0 && num >= -9)){
			System.out.println("this is single digit");
		}
		else if((num>=10 && num <=99 )|| (num>= -10 && num<= -99)){
			System.out.println("this is double digit");
		}
		else if((num>=100 && num <=999) ||( num>= -100 && num<= -999)){
		 
			System.out.println("this is triple digit");
		}
		else{
			
			System.out.println("this is above three digit");
		}
	}

}
