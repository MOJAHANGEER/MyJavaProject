package test4;

import java.util.Scanner;

public class PlaceOfService {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sex (M or F) ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		
	  /*  System.out.println("Enter marital status (Y or N)");
		char c=sc.next().charAt(0); */
		
		if(ch == 'F' || ch=='f')
		{
			System.out.println("She Work Only in urban areas");
			
		}
		
		else if((ch=='M' || ch=='m') && (age>=20 && age<=40))
		{
			System.out.println("He work in anywhere");
		}
		else if((ch=='M' || ch=='m')&& (age>=40 && age<=60))
		{
			System.out.println("He will Works in urban areas only");
		}
		else
		{
			System.out.println("ERROR");
		}
		

	}

}
