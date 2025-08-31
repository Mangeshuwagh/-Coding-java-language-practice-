// File writing Using String : 
import java.util.Scanner;
 import java.io.*;
  
  public class FileApp{
	  public static void main(String []args)throws IOException
	  {
		  FileWriter f = new FileWriter("D:\\Java program  all\\File Handling\\DemoFile.tex",true);
		  
		  Scanner cin = new Scanner(System.in);
		   System.out.print("Enter the Your Data: ");
		    String data = cin.nextLine();
			 f.write(data);
			  f.close();
			   System.out.print("Data Save Successfully..............");
			   
			   // file Reading 
			    //FileReader fr =  new FileReader("")
		  
	  }
  }