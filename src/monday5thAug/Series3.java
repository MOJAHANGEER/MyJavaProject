package monday5thAug;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter term of no");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
			int result=i*i*i;
		System.out.println(result);	
		}

	}

}
