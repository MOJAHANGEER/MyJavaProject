package doWhileLoop.java;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first no.");
		 int first=sc.nextInt();
		 System.out.println("Enter second no.");
		 int second=sc.nextInt();
		 
		 char ch;
		 do{
			 System.out.println("+.Addition\n-.Substraction\n*.Multipllication\n/.Division");
			 System.out.println("Please choose anyone to perform operation ");
			 int choose=sc.next().charAt(0);
			 
			 switch(choose){
			 
			 case '+': System.out.println("Addition is="+(first+second));
			 break;
			 case '-': System.out.println("Substraction is="+(first-second));
			 break;
			 case '*': System.out.println("Multiplication is="+first*second);
			 break;
			 case '/': System.out.println("Division ="+(first/second));
			 break;
			 default: System.out.println("This is invalid case go and enter valid case");
			 
			 }
			 System.out.println("Enter you choice...");
			 ch=sc.next().charAt(0);
			 
		 }while(ch == 'y' || ch == 'Y');
		 

	}

}
