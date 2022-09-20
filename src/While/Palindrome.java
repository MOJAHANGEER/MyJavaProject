package While;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int num=sc.nextInt();
		int copy=num;
		int reverse=0;
		while(num>0){
			int r=num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		num=copy;
		System.out.println(reverse);
		if(num==reverse){
			System.out.println("This is a palindrome no");
			
		}else{
			System.out.println("This is not a palindrome no");
		}
		
		

	}

}
