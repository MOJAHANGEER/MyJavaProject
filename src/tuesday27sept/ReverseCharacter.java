package tuesday27sept;

import java.util.Scanner;

public class ReverseCharacter {
	
	public static char reverseChar(char []a)
	{
		char c='0';
		for(int i=a.length-1;i>=0;i--)
		{
			c=a[i];
			System.out.println(c);
			
		}
		return c;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cahracters");
		char ch[]=new char[6];
		 
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		
		}
		char ans=ReverseCharacter.reverseChar(ch);

	}

}
