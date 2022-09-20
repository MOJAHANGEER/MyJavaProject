package While;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int x=num;
		int count=0,rem=0;
		while(num>0){
			
			if((num%10==0) || (num%10==1))
				count++;
				rem++;
				num=num/10;
			
			
		}if(count==rem){
			System.out.println("This is a binary no="+x);
		}
		else{
			System.out.println("This is not a binary no="+x);
		}
	}

}
