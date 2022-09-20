package switchAssignment;

import java.util.Scanner;

public class GreatestN {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int first=sc.nextInt();
		System.out.println("Enter second no");
		int sec=sc.nextInt();
	    boolean ans=(first>sec);
	    String res=String.valueOf(ans);
		switch(res){
		case "o": System.out.println("First is greater");
		break;
	    default: System.out.println("second is greater");
		}
		
	}

}
