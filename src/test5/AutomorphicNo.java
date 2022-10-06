package test5;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int sqr=no*no;
		System.out.println(sqr);
		int temp=no;
		int r=0;
		int rem=0;
		while(no>0){
			 r=no%10;
			 rem=sqr%10;
			
			no=no/10;
			sqr=sqr/10;
		}
		if(r==rem){
			System.out.println("This is automorphic");
		}
		else{
			System.out.println("this is not automorphic");
		}

	}

}

