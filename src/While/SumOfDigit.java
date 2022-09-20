package While;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int sum=0;
		while(num>0){
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			
		}
		System.out.println("This is your sum of digit="+sum);
		
	}

}
