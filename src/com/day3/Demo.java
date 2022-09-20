package com.day3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//write a code to calculate the sum of even digits from the no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nay no.");
		int no=sc.nextInt();
		int sum=0;
		while(no>0){
			int r=no%10;
			if(r%2==0){
				sum=sum+r;
				
			}
			
			no=no/10;
		}
		System.out.println(sum);
		
	}

}
