package monday5thAug;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int count=0;
		int result=1;
		for(int i=1;i<=no;i++){
	
			count=count+i;
			System.out.println(count);
			
		}
		

	}

}
