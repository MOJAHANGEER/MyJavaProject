package wednesday12Oct;

import java.util.Scanner;

public class CountTheNoOfWords {

	public static void main(String[] args) {

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");*/
		String str = "we are a squad of a chai lover";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=0))
			{
			count++;
			}
		}
		System.out.println(count);
		

	}

}
