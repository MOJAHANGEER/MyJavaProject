package test2;

import java.util.Scanner;

public class TrimorphicOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int r=1;
		while(num>0){
			r=num*num*num;
			if(r%10==num){
				System.out.println("This is trimorphic ");
				break;
			}
			else{
				System.out.println("NOt");
				break;
			}
		}

	}

}
