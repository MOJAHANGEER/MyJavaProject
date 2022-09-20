package monday5thAug;

import java.util.Scanner;

public class DisariumNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0,count=0;
		while(num>0)
		{
			rem=num%10;
			count++;
			num=num/10;
			
		}
		num=temp;
		for(int i=count;i>=1;i--)
		{
			sum=sum+(int)Math.pow(num%10,i);
			num=num/10;
		}
		if(sum == temp)
		{
			System.out.println("This is deisarium number");
		}
		else
		{
			System.out.println("This is not disarium number");
		}

	}

}
