package test4;

import java.util.Scanner;

public class UsingTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sale amount");
		int sale = sc.nextInt();
		float commission = 0;

		commission = sale > 1500 ? (sale * 5) / 100 : 0.0f;
		System.out.println(commission);

	}

}
