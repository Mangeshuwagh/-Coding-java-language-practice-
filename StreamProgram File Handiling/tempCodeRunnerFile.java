//Write a Java program to create a file and write contents, save and close the file.

import java.io.*;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) throws Exception {

		File fe = new File("D:\\Java program  all\\IOStream all programs\\WriteText");
		boolean check = fe.exists();
		if (check) {
			System.out.println("Directory is Alery Create: ");

		} else {

			boolean cre = fe.mkdir();
			if (cre) {
				System.out.println("File is Created: ");

			} else {
				System.out.println("File is not Created you check the issue: ");
				return;
			}
		}
		File file = new File("D:\\Java program all\\IOStream all programs\\WriteText\\Write.txt");

		// Use FileWriter to create and write to the file
		if (!file.exists()) {
			file.createNewFile(); // Create the file if it doesn't exist
			System.out.println("File is created: " + file.getAbsolutePath());
		}

		FileWriter fw = new FileWriter("D:\\Java program  all\\IOStream all programs\\Write a Text\\Write.text", true);

		Scanner cin = new Scanner(System.in);
		System.out.println("Write the Something your Thought: ");

		String some = cin.nextLine();
		fw.write(some + "\n");

		fw.close();
		System.out.println("Succesful you write the your dreams thoughts........");

	}
}