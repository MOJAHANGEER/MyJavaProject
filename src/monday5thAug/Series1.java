package monday5thAug;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of term");
			int no=sc.nextInt();
			int result;
			for(int i=1;i<=no;i++){
				result=i*i+1;
				System.out.println(" "+result);
			}

	}

}
