package doWhileLoop.java;

import java.util.Scanner;

public class CalculationArea{
	
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of hight ");
			double height =sc.nextDouble();
			System.out.println("Enter value of width");
			double width = sc.nextDouble();
			
			char ch;
			do{
				
				 System.out.println("Rectangle\nTriangle\nsquare\nCircle");
				 String str=sc.next();
					double PI=3.14;
					float radius=5.5f;
			
			
			switch(str){
			
			case "Rectangle": System.out.println("this is area of Rectangle="+(height*width));
							  break;
							  
			case "Triangle": System.out.println("this is area of triangle="+(height*width)*0.5);
			                  break;	
			                  
			case "Square": System.out.println("this is area of square= "+height*width);
			               break; 
			               
			case "Circle": System.out.println("this is your area of circle="+(PI*radius*radius));
			                break;
			                
			default: System.out.println("this is invalid entry...go and enter valid entry");
			
			
			}System.out.println("you want to cantinue....");
			ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			
			

	}

}
