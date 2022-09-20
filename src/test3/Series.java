package test3;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int sum=0;
	
		/*System.out.print(sum+",");
		for(int i=2;i<=no;i++)
		{
			
			
			if(i%2==0){
				continue;
			}
			else
			{
				sum=i+sum;
				System.out.print(sum+",");
				
			}
		}
		*/
		// This is second way to solve this problem.
		for(int i=1;i<no;i++)
		{
			sum=(i*i)-1;
			System.out.print(sum+",");
		}

	}

}
