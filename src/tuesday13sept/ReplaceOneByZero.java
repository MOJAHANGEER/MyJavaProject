package tuesday13sept;

import java.util.Scanner;

public class ReplaceOneByZero {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int temp=no;
		int count=0;
		int num=0;
		int num2=0;
		while(no>0)
		{
			int r=no%10;
			if(r==1)
			{
				r=0;
			}
			num=num*10+r;
			no=no/10;
			
		}
		
		while(num>0)
		{
			int r1=num%10;
			num2=num2*10+r1;
			num=num/10;
		}
		System.out.println(num2);

	}

}
