package forloop.day4;

import java.util.Scanner;
//Diplay prime number

public class PrimeNO {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}if(isPrime==true){
			System.out.println("Prime");
		}else{
			System.out.println("not Prime");
		}
	}
}
