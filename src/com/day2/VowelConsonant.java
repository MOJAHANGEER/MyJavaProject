package com.day2;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any character");
		char c=sc.next().charAt(0);
		if (c=='a' || c=='A'){
			System.out.println("this is vowel");
		}
		else if (c == 'e' || c== 'E'){
			System.out.println("this is vowel");
		}
		else if(c =='i' || c=='I'){
			System.out.println("this is vowel");
		}
		else if(c=='o' || c=='O'){
			System.out.println("this is vowel");
		}
		else if(c =='u' || c == 'U'){
			System.out.println("this is vowel");
		}
		else{
			System.out.println("this is consonants");
		}
		

	}

}
