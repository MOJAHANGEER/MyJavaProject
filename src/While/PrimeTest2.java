package While;

import java.util.Scanner;

public class PrimeTest2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		boolean isPrime=true;
		int i=2;
		while(i<num){
			
			if(num%i==0){
				
				 isPrime=false;
				 break;
			}
			 
			i++;
		}
		if(isPrime==true){
			System.out.println("this is prime no");
		}
		else{
			System.out.println("This is not prime");
		}

	}

}
