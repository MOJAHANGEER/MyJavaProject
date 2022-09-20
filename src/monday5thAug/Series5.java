package monday5thAug;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of term");
		int no=sc.nextInt();;
		for(int i=1;i<=no;i++){
			if(i%2!=0){
				System.out.println(i*i);
			}
		}

	}

}
