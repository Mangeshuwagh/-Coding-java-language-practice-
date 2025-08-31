//Write a Java  program to read file contents and display on console.

import java.util.Scanner;
 import java.io.*;
  
  public class Practical2
  {
	  public static void main(String []args)throws IOException
	  {
		  Scanner cin = new Scanner(System.in);
		  
		  File newFile = new File("D:\\Java program  all\\StreamProgram\\ReadFile");
		  
		  if(newFile.exists())
		  {
			  System.out.println("Folder Alredy Created \n \t\t\t You want Read the Documents File so Press you? press = y or Y");
			  
			  char choice =  cin.nextLine().charAt(0);
			  if(choice == 'y'||choice =='Y')
			  {
				   FileReader fileread = new FileReader("D:\\Java program  all\\StreamProgram\\ReadFile\\Readfile.text");
				   
				   int data ;
				    while((data=fileread.read())!=-1){
						System.out.print((char)data);
					}
			  }
			  else{
				  System.out.println("File Exits Succesfully.............");
			  }
			  
		  }
		  else{
			  
			  boolean folderCreate = newFile.mkdir();
			  if(folderCreate)
			  {
				  System.out.println("Folder Created Succesfully: ");
				  
				  File nFile = new File(newFile,"Readfile.text");
				  FileWriter f = new FileWriter(nFile, true);
				  System.out.println("Enter the Data In the Documents: ");
				  String data = cin.nextLine();
				  
				  f.write(data);
				  f.close();
				  System.out.println("Data Succesfully Write: ...........");
				  //f.Write()
				  
			  }
			  else{
				  System.out.println("Folder is not Created Some Ishuue you check the path otherwise..........");
			  }
		  }
		  
	  }
  }