package test2;

import java.util.Scanner;

public class SumOfFactorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int total=0,i=1;
		while(i<=no){
			int fact=1,j=1;
			while(j<=i){
				fact=fact*j;
				j=j+1;
			}
			total=total+fact;
			i=i+1;
		}
		System.out.println("sum of factorial:"+total);

	}

}
