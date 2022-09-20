package tuesday13sept;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no");
		int num = sc.nextInt();
		boolean is_powerOfThree=true;
		
		if(num<=0)
		{
			is_powerOfThree=false;
			
		}
		while(num%3==0)
		{
			num=num/3;
		}
		if(num==1)
		{
			System.out.println(is_powerOfThree=true);
		}
		else
		{
			System.out.println(is_powerOfThree=false);
		}
	}

}
