package com.day3;

import java.util.Scanner;

public class SwitchVowelsConsonants {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some character");
		char c=sc.next().charAt(0);
		switch(c){
		
		case 'a':
		case 'A':System.out.println("vowel");
		      break;
		case 'e':
		case 'E':System.out.println("vowel");
		      break;
		case 'i':
		case 'I':System.out.println("vowel");
		      break;
		case 'o':
		case 'O':System.out.println("vowel");
		      break;
		case 'u':
		case 'U':System.out.println("vowel");
		      break;
		default: System.out.println("consonants");
		         break;
		         
	              
		}

	}

}
