package switchAssignment;

import java.util.Scanner;

public class DayMonth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of month");
		System.out.println("1.January\n2.Februry\n3.March\n4.April\n5.May\n6.June\n7.July\n8.Auguast\n9.September\n10.October\n11.November\n12.December");
		System.out.println("choose any one");
		int no=sc.nextInt();
		switch(no){
		
		case 1: System.out.println("31");
		break;
		case 2: System.out.println("28");
		break;
		case 3: System.out.println("31");
		break;
		case 4: System.out.println("30");
		break;
		case 5: System.out.println("31");
		break;
		case 6: System.out.println("30");
		break;
		case 7: System.out.println("31");
		break;
		case 8: System.out.println("31");
		break;
		case 9: System.out.println("30");
		break;
		case 10: System.out.println("31");
		break;
		case 11: System.out.println("30");
		break;
		case 12: System.out.println("31");
		break;
		default: System.out.println("this is invalid case");
		break;
		}

	}

}
