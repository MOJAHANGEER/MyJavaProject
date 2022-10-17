package string.weekendTest;

import java.util.Scanner;

import thursday13Oct.String.ValidOrNot;

/*6.	Write a java method called checkReverseSum which returns true if the sum of first
three numbers is equal to sum of last three numbers. Input is a string parameter to
the method, output is a boolean.*/

public class Q6_Solution {

	public static void checkValid(String st) {

		boolean isDigit = false;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) >= '1' && st.charAt(i) <= '9') {

				isDigit = true;
			} else {
				System.out.println("ERROR");
				isDigit = false;
				break;
			}
		}
		if (isDigit == true) {
			int sum1 = 0, sum2 = 0, x = st.length() - 1;
			for (int j = 0; j < 3; j++) {
				sum1 = sum1 + st.charAt(j);
				sum2 = sum2 + st.charAt(x);
				x--;
			}
			if (sum1 == sum2) {
				System.out.println("true");
			} else {
				System.out.println("false ");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string no.");
		String no = sc.next();
		ValidOrNot.checkValid(no);

	}

}
