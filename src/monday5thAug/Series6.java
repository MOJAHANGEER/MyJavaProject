package monday5thAug;

import java.util.Scanner;

public class Series6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int sum=0;
		int no=sc.nextInt();
		for(int i=0;i<no;i++){
			 sum=(1+(i*(i+1))/2);
			 System.out.println(sum);
		}
		
	}

}
