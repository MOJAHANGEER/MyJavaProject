package test4;

import java.util.Scanner;

public class SumOfNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int sum=0;
		while(no>0)
		{
			int r=no%10;
			sum=sum+r;
			no=no/10;
		}
		System.out.println(sum);

	}

}
