package com.day2;

import java.util.Scanner;

public class CharAlphaDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any char");
		char c=sc.next().charAt(0);
		if((c >= 'A' && c <= 'Z')||(c>='a' && c<='z')){
			
			System.out.println("This is a alphabet");
		}
		else if(c>='0' && c<='9'){
			System.out.println("This is digit");
		}
		else{
			System.out.println("This is a speical character");
		}
		

	}

}
