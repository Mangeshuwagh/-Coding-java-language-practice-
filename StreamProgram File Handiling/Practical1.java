//Write a Java program to create a file and write contents, save and close the file.

import java.util.Scanner;
import java.io.*;

public class Practical1 {

	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		File file = new File("D:\\Java program  all\\StreamProgram\\Mangesh");

		boolean check = file.exists();

		if (check) {
			System.out.println(
					"Folder is alredy create \n you read the Data in the folder inside one documnets: press y || Y");
					
					char choice = cin.nextLine().charAt(0);
					
					if(choice=='y'|| choice=='Y')
					{
						
						FileReader fr = new FileReader("D:\\Java program  all\\StreamProgram\\Mangesh\\mangesh.text");
						 
						 int data ;
						 while((data=fr.read())!=-1)
						 {
							 System.out.print((char)data);
						 }
						
					}
					else{
						System.out.println("Program executed successfully");
					}
					
					

		} else {

			boolean folderCreated = file.mkdir();
			if (folderCreated) {
				System.out.println("Folder Created by Succesfully");

				File newFile = new File(file, "mangesh.text");// create the one the documents
				FileWriter f = new FileWriter(newFile, true);// constructor create

				System.out.println("Enter the Data: to File in Documents: ");
				String dt = cin.nextLine();
				f.write(dt);
				f.close();
				System.out.println("Succesful data Write here: ");
			} else {
				System.out.println("Some issue Folder is not Created: ");
				return;
			}
		}
	}
}