package While;

import java.util.Scanner;

public class SingleDoubleTriple {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit or any no");
		int no=sc.nextInt();
		int count=0;
		while(no>0){
			no=no/10;
			count++;
			
		}
		if(count==1){
			System.out.println("This is digit");
		}
		else if(count==2){
			System.out.println("This is two digit");
			
		}
		else if(count==3){
			System.out.println("This is three digit");
		}
		else{
			
			System.out.println("this is above 3 digit");
		}

	}

}
