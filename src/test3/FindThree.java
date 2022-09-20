package test3;

import java.util.Scanner;

public class FindThree {
	
	public static boolean findThree(int num)
	{
		boolean isPresent=false;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==3)
			{
				isPresent=true;
				break;
			}
			
			num=num/10;
		}
		return isPresent;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		boolean isPresent=false;
		isPresent=FindThree.findThree(num);
		System.out.println(isPresent);
		
		
		

	}

}
