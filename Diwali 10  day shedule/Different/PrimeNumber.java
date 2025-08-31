//Q 1 ) Prime Number Checker for 1 to N
//Specification: Create a class PrimeChecker that takes an integer N via the
//constructor and checks if each number from 1 to N is a prime number using a loop.
//Input: An integer N.
//Output: Whether each number from 1 to N is a prime number or not.

import java.util.Scanner;
import java.util.spi.ToolProvider;

class PrimeChecker {

	private int number;

	public PrimeChecker(int number) {

		this.number = number;
	}

	public void showPrimnuber() {
		System.out.println("Show the All the Prime Numbers: ");

		int TPrimenumber = 0;
		for (int i = 1; i <= number; i++) {
			int count = 0;
			// int k =i;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
					/* code */
				}
			}

			if (count == 2) {
				System.out.println(" " + i);
				/* code */
				TPrimenumber++;
			}

		}
		System.out.println("Total Primber in the Range " + TPrimenumber);
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		int number;
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the N number yo want the print the all prime nummbers ranges");
		number = cin.nextInt();

		PrimeChecker p = new PrimeChecker(number);
		p.showPrimnuber();
	}

}
