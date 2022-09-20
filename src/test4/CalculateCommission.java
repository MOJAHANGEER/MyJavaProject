package test4;

import java.util.Scanner;

public class CalculateCommission {

	public static void main(String[] args) {
		
		System.out.println("Enter sales amount ");
		Scanner sc=new Scanner(System.in);
		int sale=sc.nextInt();
		float commission=0;
		
	/*	if(sale>2000)
		{
			commission=(sale*5)/100;
			System.out.println(commission);
		}
		else
		{
			System.out.println("no commission");
		}
		
		 */

		commission=sale>2000?(sale*5)/100:0;
		System.out.println(commission);
	}

}
