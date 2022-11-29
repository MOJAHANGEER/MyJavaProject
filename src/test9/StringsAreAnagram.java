package test9;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAreAnagram {

	public static void anagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Both Are Anagram");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.next();
		System.out.println("Enter second String");
		String str2=sc.next();
		StringsAreAnagram.anagram(str1, str2);
		
		
		}

}
