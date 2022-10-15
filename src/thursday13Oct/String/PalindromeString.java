package thursday13Oct.String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		String st="";
		for(int i=str.length()-1;i>=0;i--)
		{
			st=st+str.charAt(i);
		}
		System.out.println(st);
		if(st.equals(str))
		{
			System.out.println("This is a palindrome ");
		}
		else
		{
			System.out.println("this is not a palindrome");
		}
		

	}

}
