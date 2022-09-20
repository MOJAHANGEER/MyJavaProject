package test2;

import java.util.Scanner;

public class SpyOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int product=1;
		//int temp2=product;
		while(num>0){
			int r=num%10;
			sum=sum+r;
			product=product*r;
			num=num/10;
		}if(sum==product){
			System.out.println("This is a spy no");
			
		}else{
			System.out.println("This is not a spy no");
		}

	}

}
