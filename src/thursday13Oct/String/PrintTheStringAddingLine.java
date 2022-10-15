package thursday13Oct.String;

import java.util.Scanner;

public class PrintTheStringAddingLine {
	
	public static void printStringByLine(String str)
	{
		String st="";
		String st1[]=str.split("\\ ");
		for(int i=0;i<st1.length;i++)
		{
			st=st+st1[i]+" ";
			System.out.println(st);
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		PrintTheStringAddingLine.printStringByLine(str);
		
		

	}

}
