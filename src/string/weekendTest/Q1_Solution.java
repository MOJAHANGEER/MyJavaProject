package string.weekendTest;

import java.util.Scanner;

//find largest word in a string.
//find smallest word in a string.

public class Q1_Solution {

	public static void largestWord(String str) {
		//str = str.trim();
		String st[] = str.split(" ");
		String s1;
		String s2;
		s1 = st[0];
		for (int j = 1; j < st.length; j++) {

			s2 = st[j];
			if (s2.length() < s1.length()) {		//in this line only change the (< for smallest and > for larget word ).
				s1 = s2;

			}

			// System.out.println(s1);
		}
		System.out.println(s1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		Q1_Solution.largestWord(str);

	}

}
