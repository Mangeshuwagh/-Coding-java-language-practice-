//Write a Java  program to read numbers from a file and write even, odd and prime numbers to separate file.

import java.util.Scanner;
import java.io.*;

public class Practical3 {
	public static void main(String[] args) throws IOException

	{
		Scanner cin = new Scanner(System.in);
		File file = new File("D:\\Java program  all\\StreamProgram\\PracticalThird");

		if (file.exists()) {
			System.out.println("Folder olready Created you want Read the documents: so press = y or Y ");

			char choice = cin.nextLine().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				FileReader fr = new FileReader("D:\\Java program  all\\StreamProgram\\PracticalThird\\Allnumbers.txt");
				BufferedReader br = new BufferedReader(fr);
				// int data;
				File evenFile = new File(file, "EvenNumbers.txt");
				FileWriter evenWriter = new FileWriter(evenFile, true);

				File oddFile = new File(file, "OddNumbers.txt");
				FileWriter oddWriter = new FileWriter(oddFile, true);

				File primeFile = new File(file, "PrimeNumbers.txt");
				FileWriter primeWriter = new FileWriter(primeFile, true);
				String line;
				while ((line = br.readLine()) != null)

				{
					String[] numbers = line.split("\\s+");
					// int i = 2;
					// int num = Integer.parsint(data = fr.read());
					// if (num % 2 == 0) {
					// evenWriter.write(num + " ");
					// } else if (num % 2 == 1) {
					// oddWriter.write(num + " ");
					// } else if (isPrime(num)) {
					// primeWriter.write(num + " ");
					// }
					for (String numStr : numbers) {
						try {
							int num = Integer.parseInt(numStr);

							// Check if number is even or odd and write to respective files
							if (num % 2 == 0) {
								evenWriter.write(num + " ");
							} else if (num % 2 == 1) {
								oddWriter.write(num + " ");
							}

							// Check if number is prime
							if (isPrime(num)) {
								primeWriter.write(num + " ");
							}
						} catch (NumberFormatException e) {
							System.out.println("Invalid number format: " + numStr);
						}
					}
				}
				br.close();
				oddWriter.close();
				evenWriter.close();
				primeWriter.close();
				System.out.println("Numbers processed and written to respective files.");
			} else {
				System.out.println("Program Succesfully Exits: ");
			}

		} else {
			// boolean fileCreated = file.mkdir();

			// if (fileCreated) {

			// File nfile = new File(file, "Allnumbers.text");
			// Filewriter f = new Filewriter(nfile, true);
			// System.out.println("Enter the numbers: ");
			// String data = cin.nextLine();

			// f.write(data);
			// f.close();
			// System.out.println("your data succesfully Write and Store : ");

			boolean fileCreated = file.mkdir();

			if (fileCreated) {
				File nfile = new File(file, "Allnumbers.txt");
				FileWriter f = new FileWriter(nfile, true);
				System.out.println("Enter the numbers: ");
				String data = cin.nextLine();

				f.write(data);
				f.close();
				System.out.println("Your data was successfully written and stored.");

			} else {
				System.out.println("File is not Created by Any Isuee check your path another ");
				return;
			}
		}

	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
