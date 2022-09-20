package While;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			int r=num%10;
		    sum=sum+r*r*r;
		    num=num/10;
		}if(sum==temp){
		System.out.println("This is armstrong no.");
 
	 }else{
		 System.out.println("this is not armstrong no");
	 }
	}
}
