package thursday13Oct.String;

import java.util.Scanner;

public class FindCorrespondenceDigit {

	public static void printDigit(char ch) {

		String str[] = { "A+3", "B+4", "C+5", "D+1" };
		if(Character.isLowerCase(ch))
		{
			ch=Character.toUpperCase(ch);
		}
		if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D') {

			for (int i = 0; i < str.length; i++) {
				if (str[i].charAt(0) == ch) {

					for (int j = 0; j < str[i].length(); j++) {
						if (str[i].charAt(j) >= '1' && str[i].charAt(j) <= '9') {
							int x = Character.getNumericValue(str[i].charAt(j));
							System.out.println(x);
						}
					}

				}
			}

		} else {
			System.out.println("Character not present");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = sc.next().charAt(0);
		FindCorrespondenceDigit.printDigit(ch);

	}

}
