package test2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int rows=sc.nextInt();
		for(int i=rows-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("*"+"");
			}
			System.out.println();
		}
	

	}

}
