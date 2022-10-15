package thursday13Oct.String;

import java.util.Scanner;

public class DeleteInString {
	
	public static void deleteString(String s1,String s2)
	{
		String s3=s1.replaceAll(s2, "");
		System.out.println(s3);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		DeleteInString.deleteString(s1,s2);
		

	}

}
