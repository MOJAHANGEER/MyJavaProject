package monday5thAug;

import java.util.Scanner;

public class KrishnamurtyNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			
			 int r=num%10;
			 int fact=1;
			 for(int i=1;i<=r;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
			 
		}
		System.out.println(sum);
		num=temp;
		if(sum==num){
			System.out.println("This is krishnamurty no");
		}
		else
		{
			System.out.println("This is not ");
		}
	}

}
