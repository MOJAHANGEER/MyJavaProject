package com.day2;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount of basic salary");
		int basicSalary=sc.nextInt();
		float gross, hra, da;
		if (basicSalary<=10000){
			
				hra=(basicSalary*20)/100f;
				System.out.println("This is hra="+hra);
				da=(basicSalary*80)/100f;
				System.out.println("This is da="+da);
				gross=basicSalary+hra+da;
				System.out.println("This is your gross salary="+gross);		
		}
		else if(basicSalary>10000 || basicSalary<=20000){
			
			hra=(basicSalary*25)/100f;
			System.out.println("This is hra="+hra);
			da=(basicSalary*90)/100f;
			System.out.println("This is da="+da);
			gross=basicSalary+hra+da;
			System.out.println("This is your gross salary="+gross);		
		}
		else if(basicSalary>20000){
			hra=(basicSalary*30)/100f;
			System.out.println("This is hra="+hra);
			da=(basicSalary*95)/100f;
			System.out.println("This is da="+da);
			gross=basicSalary+hra+da;
			System.out.println("This is your gross salary="+gross);		
		}
		else{
			System.out.println("This is wrong entry go and enter valid salary");
		}

	}

}
