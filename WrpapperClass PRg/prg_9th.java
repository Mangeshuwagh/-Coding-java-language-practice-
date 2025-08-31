//Q9. WAP to input string and reverse word from a string?
//Example: good morning india
//Output: doog gninrom aidni

import java.util.*;

public class prg_9th {

	public static void main(String[] args) {
		String name = "good morning india";
		System.out.println(" Show the String : " + name);
		// char ch[] = name.toCharArray();
		String str[] = name.split(" ");

		for (int i = 0; i < str.length; i++) {
			String strr = new StringBuffer(str[i]).reverse().toString();

			str[i] = strr;

		}
		name = name.join(" ", str);

		// name = str.j(" ",str);
		System.out.println("Show the all after the Revers the Words \n" + name);

	}

}