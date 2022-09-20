package test3;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int no= sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
				
			}System.out.println();
			
		}
		

	}

}
