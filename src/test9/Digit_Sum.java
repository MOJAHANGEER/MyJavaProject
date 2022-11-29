package test9;

import java.util.Scanner;

public class Digit_Sum {

	public static int digit_sum(int num)
	{
		int sum=0;
		sum=num%10;
		if(num==0)
		{
			return 0;
		}
		else
		{
			return sum+digit_sum(num/10);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int result=Digit_Sum.digit_sum(num);
		System.out.println(result);
		

	}

}
