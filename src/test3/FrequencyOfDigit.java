package test3;

//Enter the mobile no and count the frequency of digit

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long number, i, count, digit, temp;
		System.out.println("Enter any Number : ");
		number = sc.nextLong();
		System.out.println("Digit" + " " + "Frequency");
		temp = number;
		int c = 0;
		while (number > 0) {
			c++;
			number = number / 10;
		}
		number = temp;
		if (c == 10) {
			for (i = 0; i <= 9; i++) {
				count = 0;
				temp = number;
				while (temp > 0) {
					digit = temp % 10;
					if (digit == i) {
						count++;
					}
					temp = temp / 10;
				}
				if (count > 0) {
					System.out.println(i + "    " + count);
				}
			}
		} else {
			System.out.println("error");
		}
		}
}

