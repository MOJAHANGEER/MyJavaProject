package switchAssignment;

import java.util.Scanner;

public class DigitToWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char ch;
		do{
			System.out.println("Enter any no ");
		
		int no=sc.nextInt();
		switch(no){
		
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		default:System.out.println("This is an error , number not exist");
		break;
		
		}
		System.out.println("do you continue...");
		ch=sc.next().charAt(0);

	}while(ch=='1');
	}
}
