package test9;

import java.util.Scanner;

public class NumberSumInString {

	public static void numbersum(String str)
	{
		int sum=0;
		String st[]=str.split("\\D");
		for(int i=0;i<st.length;i++)
		{
		if(st[i].trim().equals(""))
		{
			sum=sum+0;
		}
		else
		{
			int a=Integer.parseInt(st[i]);
			sum=sum+a;
		}
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		NumberSumInString.numbersum(str);
		

	}

}
