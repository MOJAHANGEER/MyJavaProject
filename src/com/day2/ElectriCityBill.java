package com.day2;

import java.util.Scanner;

public class ElectriCityBill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of unit");
		float unit=sc.nextFloat();
	    double bill;
		if(unit<=50){
			
			bill= (0.50/unit*30);
			System.out.println("This is your bill="+bill);
		}
		else if(unit>50 || unit <=150){
			bill =0.75/unit*30;
			System.out.println("This is your bill="+bill);
		} else if (unit>150 || unit<=250){
			bill=1.20/unit*30;
			System.out.println("This is your bill="+bill);
			
		}
		else if(unit>250){
			bill =1.50/unit*30;
			bill=bill+(20*unit/100);
			System.out.println("This is your bill="+bill);		
		}
		else{
			System.out.println("This bill is out of range");
		}
		

	}

}
