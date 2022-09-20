package monday5thAug;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int no=sc.nextInt();
		int result;
		for(int i=1;i<=no;i++){
			result=i*i;
			System.out.println(result);
		}

	}

}
