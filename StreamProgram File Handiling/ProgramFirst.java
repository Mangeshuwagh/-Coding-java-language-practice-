import java.io.*;
 
 
 public class ProgramFirst{
	 
	 public static void main(String []args)
	 {
		 
		 File fe = new File("D:\\Java program  all\\IOStream all programs\\ Practicals");
		 
		 boolean check = fe.mkdir();
		  if(check)
		  {
			  System.out.println("Folder created:");
		  }
		  
		  else{
			  System.out.println("Folder is not Created: ");
			  
		  }
	 }
 }