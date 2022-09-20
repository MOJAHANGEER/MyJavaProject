package While;

import java.util.Scanner;

public class AverageDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int count=0;
		while(num>0){
			 int r=num%10;
			 sum=sum+r;
			 num=num/10;
			 count++;
			 
		}
		
			System.out.println("this is your sum of no="+sum);
			double avg=sum/count;
			System.out.println("this is avg="+avg);
	}

}
