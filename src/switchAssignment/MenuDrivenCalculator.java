package switchAssignment;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char ch;
		do{
			System.out.println("Enter first no");
			int first=sc.nextInt();
			System.out.println("Enter second no");
			int second=sc.nextInt();
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("Enter any one");
			int no=sc.nextInt();
			switch(no){
			
			case 1:System.out.println("the addition of no is="+(first+second));
			break;
			case 2:System.out.println("the substraction of no is="+(first-second));
			break;
			case 3:System.out.println("the addition of no is="+(first*second));
			break;
			case 4: System.out.println("the addition of no is="+(first/second));
			break;
			default: System.out.println("this is invalid case");
			break;
			
			}
			System.out.println("should i continue...");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		System.out.println("your programme is stop now");
	}

}
