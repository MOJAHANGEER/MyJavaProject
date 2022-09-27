package test5;

import java.util.Scanner;

public class NationalGames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name");
		String name=sc.nextLine();
		
		switch(name)
		{
		case "india" : System.out.println("Hocky");
		break;
		case "china" : System.out.println("Table Tennis");
		break;
		case "Bangladesh" : System.out.println("Kabaddi");
		break;
		case "Italy" : System.out.println("Football");
		break;
		case "United States" : System.out.println("Base Ball");
		break;
		
		default : System.out.println("the data is not present about this country");
		break;
		
		}

	}

}
