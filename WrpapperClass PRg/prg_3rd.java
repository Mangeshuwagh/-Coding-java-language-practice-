// Q3. WAP to input two strings and compare then without using equals() or compareTo() method ?

import java.util.*;

public class prg_3rd {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		System.out.println("Ennter the First String ");
		String FirstString = cin.nextLine();
		System.out.println("Enter the Second String ");
		String SecondString = cin.nextLine();
		System.out.println("First String : " + FirstString + "\n Second String : " + SecondString);
		int result = campare(FirstString, SecondString);
		if (result == 1) {
			System.out.println("String is eqauls ");
		} else {
			System.out.println("String is not equals");
		}

	}

	public static int campare(String f1, String f2) {
		if (f1.length() == f2.length()) {
			// System.out.println("String is campare");

			boolean flag = false;
			char[] ch = f1.toCharArray();
			char ch2[] = f2.toCharArray();
			for (int i = 0; i < f1.length(); i++) {

				if (ch[i] != ch2[i]) {
					flag = false;
				} else {
					flag = true;
				}

			}
			if (flag) {

				return 1;
			} else {
				return 0;
			}

		} else {
			return 0;
		}

	}
}
